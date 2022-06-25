package UILayer;

import ApplicationLayer.ReturnBookK;

public class ReturnBookAAS {
    private ReturnBookK ctrl = new ReturnBookK();

    public ReturnBookAAS() {}

    public void returnBook() {
        System.out.println("=== return book ===");
        System.out.println("select title you want to return: ");
        String[] rentedBooks = ctrl.getRentedBooks();  // all books rented by user
        String toReturn = ConsoleInputAAS.choose(rentedBooks);  // select one
        if (!toReturn.equals(""))
            ctrl.returnBook(toReturn);  // return selected
    }
}
