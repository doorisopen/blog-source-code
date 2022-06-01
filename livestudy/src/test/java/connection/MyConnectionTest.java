package connection;

import org.junit.jupiter.api.Test;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.List;

class MyConnectionTest {

    @Test
    void connect() {
        GitHub github = null;
        try {
            github = GitHub.connectAnonymously();
            GHRepository repository = github.getRepository("whiteship/live-study");
            List<GHIssue> issues = repository.getIssues(GHIssueState.ALL);
            for (GHIssue issue : issues) {
                System.out.println(issue.getBody());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}