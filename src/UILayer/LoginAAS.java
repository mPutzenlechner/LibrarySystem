package UILayer;

import ApplicationLayer.LoginK;

public class LoginAAS {
    private LoginK ctrl = new LoginK();

    public LoginAAS() {}

    public void login() {
        boolean loginSuccess = false;
        while (!loginSuccess) {
            String username = ConsoleInputAAS.insert("username: ");
            String password = ConsoleInputAAS.insert("password: ");
            try {
                ctrl.loginUser(username, password);
                loginSuccess = true;
                System.out.println("success!");
                // TODO: navigate to next menu
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
