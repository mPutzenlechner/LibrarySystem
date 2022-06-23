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

    public static String[] getUserNames() {
        // create output array
        String[] UserNames = new String[allUsers.size()];
        int i = 0;
        // extract keys from hashMap
        for (String name : allUsers.keySet() ) {
            UserNames[i] = name;
            i++;
        }
        return UserNames;
    }
    public static User getName(String inName) {return allUsers.get(inName);}

    public void copyUserStats (User instanz){
        this.name = instanz.name;
        this.isAdmin = instanz.isAdmin;
        this.password = instanz.password;
        this.rentedBooks = instanz.rentedBooks;
        if (instanz.name != this.name){
            allUsers.remove(this.name);
            allUsers.put(instanz.name,this);
            this.name = instanz.name;
        }
    }
}
