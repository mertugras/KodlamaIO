import java.util.ArrayList;
import java.util.List;

public class UserManager {
    User user;
    ArrayList<User> users;

    public UserManager() {
        users=new ArrayList<>();
    }

    public void add(User user) {
        users.add(user);
    }


    public void update(User user) {
        users.set(user.getId()-1,user);

    }

    public void Delete(User user) {
        users.remove(user.getId()-1);
    }


    public ArrayList<User> get(User user) {
        return users;
    }
};


