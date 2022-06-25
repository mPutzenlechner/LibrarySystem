package ApplicationLayer;

import DataLayer.Book;
import DataLayer.Library;

public class AddBookK {
    public void addBook(Book book) {
        Library.addBook(book);
    }

    public Book newBook(String title, int isbn) {
        return new Book(title, isbn);
    }
}
