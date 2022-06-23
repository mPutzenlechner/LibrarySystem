package UILayer;

import ApplicationLayer.UserSelectK;
import DataLayer.User;

public class UserSelectAAS {

    private UserSelectK controll;
    private User activeUser;

    public UserSelectAAS(User aktiveUser) {
        this.activeUser = aktiveUser;
        this.controll = new UserSelectK();
    }
        public User select() {
            System.out.println("=== Choose User ===");
            String selection = ConsoleInputAAS.choose(controll.getUserName());
            return controll.getUser(selection);
    }
}
