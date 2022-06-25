package UILayer;

import java.util.Scanner;

public class ConsoleInputAAS {
    static String insert(String userInput) {
        System.out.println(userInput);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static String choose(String[] alternatives) {
        if (alternatives.length == 0) {
            System.out.println("nothing to choose from");
            return "";
        }
        String output = new String();
        boolean insertRequired = false;
        while (!insertRequired) {
            System.out.println("Please insert number: ");
            for (int i = 0; i < alternatives.length; i++) {
                System.out.println((i + 1) + ") " + alternatives[i]);
            }
            String input = insert("Input: ");
            if (input.equals("")) {
                System.out.println("No Index entered");
                System.out.println("Please repeat insert");
            } else if (Integer.parseInt(input) < 1 || alternatives.length < Integer.parseInt(input)) {
                System.out.println("Invalid Index entered");
                System.out.println("Please repeat insert");
            } else {
                insertRequired = true;
                output = alternatives[Integer.parseInt(input) - 1];
            }
        }
        return output;
    }
}
