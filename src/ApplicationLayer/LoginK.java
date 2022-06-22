package ApplicationLayer;

import DataLayer.User;
import DataLayer.Book;

public class LoginK {
    public LoginK() {}
    public void loginUser(String name, String password) {
        if (User.allUsers.containsKey(name)) {  // does input user exist?
            if (User.allUsers.get(name).matchesPassword(password)) {  // does password match?
                User.activeUser = User.allUsers.get(name);  // if yes, set input user as logged in
            } else {
                throw new IllegalArgumentException("password does not match");
            }
        } else {
            throw new IllegalArgumentException("user does not exist");
        }
    }
}
