package UILayer;

import ApplicationLayer.RentBookK;

import java.util.ArrayList;

public class RentBookAAS {
    private RentBookK ctrl = new RentBookK();

    public RentBookAAS() {}

    public void rentBook() {
        String[] availableTitles = ctrl.getAvailableTitles().toArray(new String[0]);
        System.out.println("=== Rent Book ===");
        System.out.println("choose from available titles: ");
        String selectedTitle = ConsoleInputAAS.choose(availableTitles);
        if (selectedTitle.equals(""))
            return;
        try {
            ctrl.rentBook(selectedTitle);
        } catch (Exception e) {
            System.out.println("renting process failed:");
            System.out.println(e.getMessage());
        }
    }
}
