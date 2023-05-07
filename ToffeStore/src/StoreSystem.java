import java.util.Objects;
import java.util.Scanner;

public class StoreSystem {
    private User currentUser;
    private ItemsManagement resources;
    private UserManagement users;
    private boolean state;
    StoreSystem(){
        currentUser = new GeneralUser();
        resources = new ItemsManagement();
        users = new UserManagement();
        state = true;
    }
    void start(){
        while (state){
            mainManu();
        }
    }
    void mainManu(){
        Scanner input = new Scanner(System.in);
        String ans;
        String secAns;
        System.out.println("---------------------------------------------------------------------");
        if(currentUser instanceof GeneralUser){//you are general user
            System.out.println(" >> welcome to our Store << ");
            System.out.println("Main Menu\n" +
                    "1- Register\n" +
                    "2- Login\n" +
                    "3- Display Catalog\n"+
                    "4- Exit");
            ans = input.nextLine();
            if(Objects.equals(ans, "1") || ans.equalsIgnoreCase("register")){
                ((GeneralUser) currentUser).register(users);
            }
            else if(Objects.equals(ans, "2") || ans.equalsIgnoreCase("login")){
                 currentUser = ((GeneralUser) currentUser).login(users);
            }
            else if(ans.equals("3")){
                resources.viewItems();
            }
            else{
                //EXIT
                state = false;
            }
        }
        else{// you are logged-in User
            System.out.println(" >> Welcome Back "+((LoggedInUser)currentUser).getUserName()+" <<");
            System.out.println("Main Menu\n" +
                    "1- Display Catalog\n" +
                    "2- Add Item to Cart\n"+
                    "3- Check Out\n" +
                    "4- View Previous Orders\n"+
                    "5- Sign Out\n" +
                    "6- Exit");
            ans = input.nextLine();
            if(Objects.equals(ans, "1") || ans.equalsIgnoreCase("Display")){
                resources.viewItems();
            }
            else if(Objects.equals(ans, "2") || ans.equalsIgnoreCase("Add")){
                System.out.println("Enter Item ID or Name");
                secAns = input.nextLine();
                Item  ITEM =  resources.getStock().getItemById(secAns);
                ITEM  = (ITEM == null ? resources.getStock().getItemByName(secAns) : ITEM);

                if(ITEM == null) {
                    System.out.println("Item Not Found..!") ;
                }
                else {System.out.println("Successfully added to your cart ..");
                    ((LoggedInUser)currentUser).addItem(ITEM,1);
                }


            }
            else if(ans.equals("3") || ans.equalsIgnoreCase("Check out")){
                if( !((LoggedInUser)currentUser).isCartEmpty() ){
                    ((LoggedInUser)currentUser).checkOut();
                }
                else{
                    System.out.println("Empty cart..! Please add items to Checkout");
                }
            }
            else if (ans.equals("4") || ans.equalsIgnoreCase("view")) {
                ((LoggedInUser)currentUser).printPrevOrders();
            }
            else if(ans.equals("5") || ans.equalsIgnoreCase("Sign Out")) {
                currentUser = new GeneralUser();
            }
            else{
                //EXIT
                state = false;
            }


        }

    }

}
