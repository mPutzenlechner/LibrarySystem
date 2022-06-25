package DataLayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Library {
    private static int inventoryEnumerator = 0;
    public static HashMap<String, Stack<Book>> inventory = new HashMap<>();

    public static void addBook(Book book) {
        if (!Library.inventory.containsKey(book.getTitle())) {
            Library.inventory.put(book.getTitle(), new Stack<>());
        }
        book.setInventoryID(inventoryEnumerator++);
        Library.inventory.get(book.getTitle()).add(book);
    }
}
