package ApplicationLayer;

import DataLayer.Book;
import DataLayer.Library;
import DataLayer.User;

import java.util.ArrayList;

public class RentBookK {
    public ArrayList<String> getAvailableTitles() {
        ArrayList<String> available = new ArrayList<>();
        for (String s : Library.inventory.keySet()) {
            if (!Library.inventory.get(s).isEmpty()) {
                available.add(s);
            }
        }
        return available;
    }

    public void rentBook(String title) {
        // Don't allow user to rent multiple instances of one title, this would cause problems
        if (User.activeUser.rentedBooks.containsKey(title)) {
            throw new IllegalArgumentException("you have already rented this book. return it first.");
        }
        // remove from library
        Book rent = Library.inventory.get(title).pop();
        // add to user stash
        User.activeUser.rentedBooks.put(title, rent);
    }
}
