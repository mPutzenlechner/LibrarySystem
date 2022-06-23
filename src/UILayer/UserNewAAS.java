package UILayer;
import DataLayer.User;
import ApplicationLayer.UserNewK;

public class UserNewAAS {
    private User activeUser;
    private UserNewK controll;

    public UserNewAAS(User aktiveUser){
        this.activeUser = activeUser;
        this.controll = new UserNewK();
    }
    public void newUser() {
        System.out.println("=== create new User ===");
        System.out.println("type *cancel* to exit the user creation");
        // get data for new Sachbearbeiter
        String name = ConsoleInputAAS.insert("Name: ");
        if (name.equals("cancel")) {
            return;
        }
        String password = ConsoleInputAAS.insert("Passwort: ");
        if (password.equals("cancel")) {
            return;
        }
        User instanz;
        boolean admin = false;
        String[] choices = new String[2];
        choices[0] = "jes";
        choices[1] = "no";
        System.out.println("Do you want to give user admin rights?");
        String choice = ConsoleInputAAS.choose(choices);
        if (choice.equals(choices[0])) {
            admin=true;
        }
        try {
            instanz = controll.createUser(name,password,admin);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        User.allUsers.put(name, instanz);
    }
}
