package DataLayer;

import java.util.HashMap;

public class User {
    // static attributes
    public static User activeUser;
    public static HashMap<String, User>  allUsers = new HashMap<>();
    public HashMap<String, Book> rentedBooks = new HashMap<>();

    // private attributes
    private String name;
    private String password;

    // ctor
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // get set
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean matchesPassword(String password) {
        if (this.password.equals(password)) {
            return true;
        } else { return false; }
    }
}
