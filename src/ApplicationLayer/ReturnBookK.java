package ApplicationLayer;

import DataLayer.Library;
import DataLayer.User;
import DataLayer.Book;

public class ReturnBookK {
    public String[] getRentedBooks() {
        return User.activeUser.rentedBooks.keySet().toArray(new String[0]);
    }

    public void returnBook(String title) {
        // take book out of user stash
        Book toReturn = User.activeUser.rentedBooks.remove(title);
        // put back into library
        Library.inventory.get(title).push(toReturn);
    }
}
