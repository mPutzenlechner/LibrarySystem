package ApplicationLayer;

import DataLayer.User;
import UILayer.UserDeleteAAS;

public class UserDeleteK {

        public String[] getUserName() {
            return User.getUserNames();
        }
        public User getUser(String inName) {
            return User.allUsers.get(inName);
        }
        public void writeUser(User copy) {
            // Controll if Name is correct
            for (char c : copy.getName().toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    throw new RuntimeException("Only letters are allowed in names");
                }
            }
            User.allUsers.get(copy.getName()).copyUserStats(copy);
        }
        public User createUser(String name, String password) {
            // Controll if Name is already taken
            for (String vorhandenerName : User.getUserNames()) {
                if (name == vorhandenerName) {
                    throw new RuntimeException("Name already taken");
                }
            }
            // Controll if signs are correct
            for (char c : name.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    throw new RuntimeException("Only letters are allowed in namesn");
                }
            }
            return new User (name, password,false);
        }
        public void removeUser(String name) {
            User user = User.allUsers.get(name);
            if (user.isAdmin() ) {
                int adminCounter = 0;
                for (User userSave : User.allUsers.values()) {
                    if (userSave.isAdmin())
                        adminCounter++;
                }
                if (adminCounter <= 1) {
                    throw new RuntimeException("Last admin can not be deleted");
                }
            }
            User.allUsers.remove(name);
        }


}
