package UILayer;

import ApplicationLayer.AdminMenuK;
import ApplicationLayer.NormalMenuK;
import DataLayer.User;

public class NormalMenuAAS {
    private static NormalMenuK ctrl = new NormalMenuK();

    public NormalMenuAAS() {}

    public static void normalMenu() {
        // put all selectable options here
        String[] choices = {"edit user", "rent book", "return book", "logout"};
        while (true) {
            // selected option will be saved as String here
            String choice = ConsoleInputAAS.choose(choices);

            // switch for possible selections
            if (choice.equals("edit user"))  {
                NormalEditUserAAS normalEditUserAAS = new NormalEditUserAAS(User.activeUser);
                normalEditUserAAS.edit();
            } else if (choice.equals("rent book")) {
                RentBookAAS rentBookAAS = new RentBookAAS();
                rentBookAAS.rentBook();
            } else if (choice.equals("return book")) {
                ReturnBookAAS returnBookAAS = new ReturnBookAAS();
                returnBookAAS.returnBook();
            } else if (choice.equals("logout")) {
                return;
            } else {
                System.out.println("invalid input");  // should never occur
            }
        }
    }
}
