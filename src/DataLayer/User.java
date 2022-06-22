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
    private boolean isAdmin;

    // ctor
    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean matchesPassword(String password) {
        if (this.password.equals(password)) {
            return true;
        } else { return false; }
    }
}
