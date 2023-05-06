import java.util.ArrayList;
public class UserManagement {
     ArrayList<LoggedInUser> logged ;
     int NumberOfUsers;
     UserManagement()
     {
         logged = new ArrayList<LoggedInUser>();
         NumberOfUsers = logged.size();
     }

     void add(LoggedInUser x)
     {

         logged.add(x);
     }
}
