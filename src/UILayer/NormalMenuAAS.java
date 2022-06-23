package UILayer;

import ApplicationLayer.AdminMenuK;
import ApplicationLayer.NormalMenuK;

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
                // TODO: call edit user interaction
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
