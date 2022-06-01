package connection;

import org.kohsuke.github.GitHub;

public class GitHubConnection implements MyConnection<GitHub> {

    @Override
    public GitHub connectToToken() throws Exception {
        return GitHub.connectUsingOAuth("abcdef");
    }

    @Override
    public GitHub connectToAnonymous() throws Exception {
        return GitHub.connectAnonymously();
    }
}
