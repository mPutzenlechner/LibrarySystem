package UILayer;

import ApplicationLayer.UserDeleteK;
import ApplicationLayer.UserEditK;
import ApplicationLayer.UserSelectK;
import ApplicationLayer.UserDeleteK;
import DataLayer.User;

public class UserDeleteAAS {
    private UserDeleteK controll;
    private User activeUser;

    public UserDeleteAAS(User aktiveUser) {
        this.activeUser = aktiveUser;
        this.controll = new UserDeleteK();
    }

    public void delete() {
        System.out.println("Choose user to delete");
        UserSelectK userSelectK = new UserSelectK(activeUser);
        User selectedUser = UserSelectAAS.select();
        controll.removeUser (selectedUser.getName());
    }
}


