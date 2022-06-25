import DataLayer.Book;
import DataLayer.Library;
import DataLayer.User;
import UILayer.LoginAAS;

public class Main {

    public static void main(String[] Args) {
        System.out.println("hello world!");
        User user1 = new User("admin", "admin", true);
        User user2 = new User("user", "user", false);
        User.allUsers.put("admin", user1);
        User.allUsers.put("user", user2);

        Book theHobbit = new Book("the Hobbit", 123);
        Book LOTR = new Book("lord of the rings", 234);
        Book potter = new Book("Harry Potter", 432);
        Library.addBook(theHobbit);
        Library.addBook(LOTR);
        Library.addBook(potter);

        LoginAAS.login();
    }
}
