import java.util.Objects;
import java.util.Scanner;

public class StoreSystem {
    private User currentUser;
    private ItemsManagement resources;
    StoreSystem(){
        currentUser = new GeneralUser();
        resources = new ItemsManagement();
    }
    void start(){

    }
    void mainManu(){
        if(currentUser instanceof GeneralUser){//you are general user
            System.out.println(" >> welcome to our Store << ");
            Scanner input = new Scanner(System.in);
            System.out.println("Main Menu\n" +
                    "1- Register\n" +
                    "2- Login\n" +
                    "3- view catalog\n"+
                    "4- Exit");
            String ans = input.nextLine();
            if(Objects.equals(ans, "1") || ans.equalsIgnoreCase("register")){
                ((GeneralUser) currentUser).register();
            }
            else if(Objects.equals(ans, "2") || ans.equalsIgnoreCase("login")){

                User x = ((GeneralUser) currentUser).login();
                if (x instanceof LoggedInUser){
                    currentUser = x ;
                }

            }
            else if(ans.equals("3")){ resources.viewItems();}
            else{
                //EXIT
                System.exit(0);
            }
        }
        else{ // you are logged-in User
//            System.out.println("Main Menu\n" +
//                    "1- display catalog\n" +
//                    "2- make Order");
            // add logged in user UI here
        }

    }

}
