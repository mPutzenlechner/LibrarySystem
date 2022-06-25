package ApplicationLayer;

import DataLayer.User;

public class UserNewK {

    public User createUser(String name, String password, boolean admin) {
        // control if name is already taken
        if (User.allUsers.containsKey(name)) {
            throw new RuntimeException("name is already taken");
        }
        // Check if input only contains Letters
        for (char c : name.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                throw new RuntimeException("Only letters are allowed in names ");
            }
        }
        return new User(name, password, admin);
    }
}

