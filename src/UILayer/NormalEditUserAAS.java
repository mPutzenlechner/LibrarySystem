package UILayer;

import ApplicationLayer.UserEditK;
import ApplicationLayer.UserSelectK;

import DataLayer.User;

public class NormalEditUserAAS {
    private UserEditK controll;
    private User activeUser;

    private User selectedUser;

    public NormalEditUserAAS(User aktiveUser) {
        this.activeUser = aktiveUser;
        this.controll = new UserEditK();
    }

    public void edit() {
        UserSelectAAS userSelectAAS  = new UserSelectAAS(activeUser);
        selectedUser = userSelectAAS.select();
        User selectedUserKopie = new User("", "", false);
        selectedUserKopie.copyUserStats(selectedUser); //TODO: disesn Fehler habe ich einfach nicht korregieren kännen
        while (true) {  // exit on "save"
            System.out.println("=== Edit user ===");
            String[] choices = new String[4];
            choices[0] = "Change name";
            choices[1] = "Change password";
            choices[2] = "save";
            choices[3] = "cancel";
            System.out.println("Choose: ");
            String choice = ConsoleInputAAS.choose(choices);
            if (choice.equals(choices[0])) {  // Change name
                String newName = ConsoleInputAAS.insert("Insert a new name: ");
                selectedUserKopie.setName(newName);
            } else if (choice.equals(choices[1])) {  // Change password
                String neuesPasswort = ConsoleInputAAS.insert("Insert a new password: ");
                selectedUserKopie.setPassword(neuesPasswort);
            } else if (choice.equals(choices[2])) {  // save
                controll.schreibeSachbearbeiter(selectedUser, selectedUserKopie);
                return;
            } else if (choice.equals(choices[3])) {  // cancel
                return;
            }
        }  // while end
    }
}
