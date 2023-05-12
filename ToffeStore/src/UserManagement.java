import java.util.ArrayList;
/**
 * This class represents a user management system.
 *
 * @author moaz
 */
public class UserManagement {

    /**
     * A list of logged-in users.
     */
    ArrayList<LoggedInUser> logged;

    /**
     * Creates a new user management system.
     */
    public UserManagement() {
        logged = new ArrayList<LoggedInUser>();
    }

    /**
     * Adds a user to the list of logged-in users.
     *
     * @param x The user to add.
     */
    public void add(LoggedInUser x) {
        logged.add(x);
    }
}
