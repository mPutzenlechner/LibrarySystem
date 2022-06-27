package UILayer;

import ApplicationLayer.UserEditK;
import DataLayer.User;

public class AdminEditUserAAS {
    private UserEditK ctrl = new UserEditK();

    public AdminEditUserAAS(){}
    public void edit(){
        System.out.println("=== admin user edit ===");

        System.out.println("select user");
        User selectedUser = ctrl.getUser(ConsoleInputAAS.choose(ctrl.getUserName()));
        User copy = new User("", "",false);
        copy.copyUserStats(selectedUser);

        while(true) {
            System.out.println("=== editing " + selectedUser.getName() + " ===");
            String[] choices = {"change name", "change password", "change permissions", "cancel", "save"};
            String choice = ConsoleInputAAS.choose(choices);
            // switch possible selections
            if (choice.equals("change name")) {
                String newName = ConsoleInputAAS.insert("new name: ");
                copy.setName(newName);
            } else if (choice.equals("change password")) {
                String newPw = ConsoleInputAAS.insert("new password: ");
                copy.setPassword(newPw);
            } else if (choice.equals("change permissions")) {
                String[] yesno = {"admin permissions", "no admin permissions"};
                String choice2 = ConsoleInputAAS.choose(yesno);
                copy.setAdmin(choice2.equals("admin permissions"));
            } else if (choice.equals("cancel")) {
                return;
            } else if (choice.equals("save")) {
                try {
                    ctrl.schreibeSachbearbeiter(selectedUser, copy);
                    return;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return;
                }
            } else {
                throw new RuntimeException("something went wrong");
            }
        }
    }
}
