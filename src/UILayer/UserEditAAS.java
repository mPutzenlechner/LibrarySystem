package UILayer;

import ApplicationLayer.UserEditK;
import DataLayer.User;

public class UserEditAAS {
    private UserEditK controll;
    private User activeUser;

    public UserEditAAS(User aktiveUser) {
        this.activeUser = aktiveUser;
        this.controll = new UserEditK();
    }

    public void edit() {
        if (activeUser.isAdmin()) {
            AdminEditUserAAS adminEditUserAAS = new AdminEditUserAAS(activeUser);
            adminEditUserAAS.edit();
        }
        else {
            NormalEditUserAAS normalEditUserAAS = new NormalEditUserAAS(activeUser);
            normalEditUserAAS.edit();
        }
    }
}
