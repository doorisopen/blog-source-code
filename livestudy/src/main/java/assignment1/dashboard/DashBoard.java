package assignment1.dashboard;

import assignment1.connection.MyConnection;
import org.kohsuke.github.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class DashBoard {
    private final Logger logger = LoggerFactory.getLogger(DashBoard.class);
    private final MyConnection<GitHub> connection;

    public DashBoard(MyConnection<GitHub> connection) {
        this.connection = connection;
    }

    public void getIssue() throws Exception {
        GitHub github = connection.connectToToken();
        GHRepository repository = github.getRepository("whiteship/live-study");

        Set<GHUser> allUsers = new HashSet<>();
        Map<Long, Integer> participantStatics = new HashMap<>();
        List<GHIssue> issues = repository.getIssues(GHIssueState.ALL);
        for (GHIssue issue : issues) {
            Set<GHUser> users = new HashSet<>();
            List<GHIssueComment> comments = issue.getComments();
            for (GHIssueComment comment : comments) {
                users.add(comment.getUser());
            }
            logger.info("title={}, issueId={}, comments count={}, participant count={}",
                    issue.getTitle(), issue.getId(), comments.size(), users.size());
            allUsers.addAll(users);
            participantStatics.put(issue.getId(), users.size());
        }

        int userTotalCount = allUsers.size();
        logger.info("user total count={}", userTotalCount);
        for (Long issueId : participantStatics.keySet()) {
            Integer issueOfParticipants = participantStatics.get(issueId);
            logger.info("issueId={}, {}/{}={}%",
                    issueId, issueOfParticipants, userTotalCount,
                    String.format("%.2f",(double) (issueOfParticipants * 100) / userTotalCount));
        }
    }
}
