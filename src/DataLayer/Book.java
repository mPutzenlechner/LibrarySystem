package DataLayer;

import java.util.HashMap;

public class Book {
    private String title;
    private int isbn;
    private int inventoryID;

    public Book(String title, int isbn, int inventoryID) {
        this.title = title;
        this.isbn = isbn;
        this.inventoryID = inventoryID;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getInventoryID() {
        return inventoryID;
    }
}
