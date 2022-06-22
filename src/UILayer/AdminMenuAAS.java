package UILayer;

import ApplicationLayer.AdminMenuK;

public class AdminMenuAAS {
    private static AdminMenuK ctrl = new AdminMenuK();

    public AdminMenuAAS() {}

    public static void adminMenu() {
        // put all selectable options here
        String[] choices = {"new user", "edit user", "delete user", "rent book", "return book", "logout"};
        while (true) {
            // selected option will be saved as String here
            String choice = ConsoleInputAAS.choose(choices);

            // switch for possible selections
            if (choice.equals("new user")) {
                // TODO: call new user interaction
            } else if (choice.equals("edit user")) {
                // TODO: call edit user interaction
            } else if (choice.equals("delete user")) {
                // TODO: call delete user interaction
            } else if (choice.equals("rent book")) {
                // TODO: call rent book interaction
            } else if (choice.equals("return book")) {
                // TODO: call return book interaction
            } else if (choice.equals("logout")) {
                return;
            } else {
                System.out.println("invalid input");  // should never occur
            }
        }
    }
}
