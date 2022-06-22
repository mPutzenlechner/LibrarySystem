package UILayer;

import ApplicationLayer.LoginK;

public class LoginAAS {
    private LoginK ctrl = new LoginK();

    public LoginAAS() {}

    public void login() {
        boolean exit = false;
        while (!exit) {
            System.out.println("==== LOGIN ====");
            System.out.println("type *exit* to end the program");
            String username = ConsoleInputAAS.insert("username: ");
            if (username.equals("exit"))
                return;
            String password = ConsoleInputAAS.insert("password: ");
            if (password.equals("exit"))
                return;
            try {
                ctrl.loginUser(username, password);
                if (ctrl.isAdmin()) {
                    // open admin menu
                    AdminMenuAAS.adminMenu();
                } else {
                    // TODO: open normal menu
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
