package UILayer;

import java.util.Scanner;

public class ConsoleInputAAS {
    static String eingeben (String eingabeAufforderung) {
        System.out.println(eingabeAufforderung);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static String waehleAus(String[] alternativen) {
        String output = new String();
        boolean eingabeErfolgreich = false;
        while (!eingabeErfolgreich) {
            System.out.println("Bitte geben Sie die gewünschte Nummer ein: ");
            for (int i = 0; i < alternativen.length; i++) {
                System.out.println((i + 1) + ") " + alternativen[i]);
            }
            String input = eingeben("Eingabe: ");
            if (input.equals("")) {
                System.out.println("kein Index eingegeben");
                System.out.println("bitte Eingabe Wiederholen");
            } else if (Integer.parseInt(input) < 1 || alternativen.length < Integer.parseInt(input)) {
                System.out.println("Ungültigen Index Eingegeben");
                System.out.println("bitte Eingabe Wiederholen");
            } else {
                eingabeErfolgreich = true;
                output = alternativen[Integer.parseInt(input) - 1];
            }
        }
        return output;
    }
}
