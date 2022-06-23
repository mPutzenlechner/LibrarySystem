package UILayer;

import ApplicationLayer.UserEditK;
import DataLayer.User;

public class AdminEditUserAAS {
    private UserEditK controll;
    private User activeUser;

    public AdminEditUserAAS(User aktiveUser){
        this.activeUser = aktiveUser;
        this.controll = new UserEditK();
    }
    public void edit(){

    }
}
