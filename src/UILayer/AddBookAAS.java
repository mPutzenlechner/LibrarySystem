package UILayer;

import ApplicationLayer.AddBookK;

public class AddBookAAS {
    private AddBookK ctrl = new AddBookK();

    public AddBookAAS(){}

    public void addBook() {
        System.out.println("=== add new book ===");
        String title = ConsoleInputAAS.insert("enter title: ");
        int isbn = Integer.parseInt(ConsoleInputAAS.insert("enter isbn: "));
        ctrl.addBook(ctrl.newBook(title, isbn));
    }
}
