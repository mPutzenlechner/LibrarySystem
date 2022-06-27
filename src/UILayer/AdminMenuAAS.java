package UILayer;
import DataLayer.User;

import ApplicationLayer.AdminMenuK;

public class AdminMenuAAS {
    private static AdminMenuK ctrl = new AdminMenuK();

    private static User activeUser;

    public AdminMenuAAS (User activeUser) {
        this.activeUser = activeUser;
        adminMenu();
    }

    public AdminMenuAAS() {}

    public static void adminMenu() {
        // put all selectable options here
        String[] choices = {"new user", "edit user", "delete user", "rent book", "return book", "add book to library", "logout"};
        while (true) {
            System.out.println("=== admin menu ===");
            // selected option will be saved as String here
            String choice = ConsoleInputAAS.choose(choices);

            // switch for possible selections
            if (choice.equals("new user")) {
                UserNewAAS newUserASS= new UserNewAAS(activeUser);
                newUserASS.newUser();
            } else if (choice.equals("edit user")) {
                AdminEditUserAAS adminEditUserAAS = new AdminEditUserAAS();
                adminEditUserAAS.edit();
            } else if (choice.equals("delete user")) {
                UserDeleteAAS userDeleteAAS = new UserDeleteAAS(User.activeUser);
                userDeleteAAS.delete();
            } else if (choice.equals("rent book")) {
                RentBookAAS rentBookAAS = new RentBookAAS();
                rentBookAAS.rentBook();
            } else if (choice.equals("return book")) {
                ReturnBookAAS returnBookAAS = new ReturnBookAAS();
                returnBookAAS.returnBook();
            } else if (choice.equals("add book to library")) {
                AddBookAAS addBookAAS = new AddBookAAS();
                addBookAAS.addBook();
            } else if (choice.equals("logout")) {
                return;
            } else {
                System.out.println("invalid input");  // should never occur
            }
        }
    }
}
