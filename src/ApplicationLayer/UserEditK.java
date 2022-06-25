package ApplicationLayer;

import DataLayer.User;

public class UserEditK {
    public String[] getUserName() {
        return User.getUserNames();
    }
    public User getUser(String inName) {
        return User.getName(inName);
    }
    public void changeUserName(User instanz, String oldName, String newName) {
        for (char c : newName.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                throw new RuntimeException("Only letters are allowed in names");
            }
        }
        instanz.setName(newName);
        User.allUsers.remove(oldName);
        User.allUsers.put(instanz.getName(), instanz);
    }
    public void schreibeSachbearbeiter(User original, User copy) {
        // Controll if Name has the right Signs
        for (char c : copy.getName().toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                throw new RuntimeException("Only letters are allowed in names");
            }
        }
        original.copyUserStats(copy);
    }
    public User createUser(String name, String password) {
        // pruefe name noch nicht vorhanden
        for (String currentName : User.getUserNames()) {
            if (name == currentName) {
                throw new RuntimeException("Name already taken");
            }
        }
        // pruefe name hat richtige Zeichen
        for (char c : name.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                throw new RuntimeException("Only letters are allowed in names");
            }
        }
        return new User(name, password, false);
    }
    public void loescheSachbearbeiter(String name) {
        User user = User.allUsers.get(name);
        if (User.activeUser.isAdmin()) {
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
