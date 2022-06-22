import DataLayer.User;
import UILayer.LoginAAS;

public class Main {

    public static void main(String[] Args) {
        System.out.println("hello world!");
        User user1 = new User("admin", "admin", true);
        User user2 = new User("user", "user", false);
        User.allUsers.put("admin", user1);
        User.allUsers.put("user", user2);
        LoginAAS loginAAS = new LoginAAS();
        loginAAS.login();
    }
}
