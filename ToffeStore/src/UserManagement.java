import java.util.ArrayList;
public class UserManagement {
     ArrayList<LoggedInUser> logged ;
     UserManagement()
     {
         logged = new ArrayList<LoggedInUser>();
     }
     void add(LoggedInUser x)
     {
         logged.add(x);
     }
}
