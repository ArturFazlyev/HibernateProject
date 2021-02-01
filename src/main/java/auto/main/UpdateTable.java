package auto.main;

import auto.model.Auto;
import auto.model.User;
import auto.service.UserService;
import org.junit.jupiter.api.Test;

public class UpdateTable {

    @Test
    public void testOne() {
        UserService userService = new UserService();
        User user = new User("Bryan", 25);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);

        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);
    }


}
