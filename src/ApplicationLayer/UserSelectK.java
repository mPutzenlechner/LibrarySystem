package ApplicationLayer;
import DataLayer.User;

public class UserSelectK {
    public String[] getUserName() {return User.getUserNames();}
    //Control function if User are in Database
    public User getUser(String inName) {
        if (User.allUsers.size() == 0) {
            throw new RuntimeException("There are currently no Users");        }
        return User.getName(inName);
    }
    public void writeUser(User copy) {
        // Control if the Name contains only Letters
        for (char c : copy.getName().toCharArray()) {
            if (Character.isAlphabetic(c)) {
                throw new RuntimeException("Only letters are allowed in names");
            }
        }
        User.allUsers.get(copy.getName()).copyUserStats(copy);
    }
    public User createUser (String name, String password) {
        // Control if name is already taken
        for (String currentName : User.getUserNames()) {
            if (name == currentName) {
                throw new RuntimeException("Name already taken");
            }
        }
        // Control if the Name contains only Letters
        for (char c : name.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                throw new RuntimeException("Only letters are allowed in names");
            }
        }
        return new User (name, password ,false);
    }
}

