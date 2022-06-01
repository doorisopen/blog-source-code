package dashboard;

import connection.GitHubConnection;
import org.junit.jupiter.api.Test;

class DashBoardTest {

    @Test
    void getIssue() throws Exception {
        DashBoard dashBoard = new DashBoard(new GitHubConnection());

        dashBoard.getIssue();
    }

    @Test
    void stat() {
        String value = String.format("%.2f", (double) (222 * 100) / 417);
        System.out.println(value);
    }
}