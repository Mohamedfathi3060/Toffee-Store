
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * This class represents a store system. It allows users to register, login, view the catalog, add items to their cart, check out, and view their previous orders.
 *
 * @author Mohamed Ftahi
 * @version 1.0
 */
public class StoreSystem {

    private User currentUser;
    private ItemsManagement resources;
    private UserManagement users;
    private boolean state;

    /**
     * Constructs a new StoreSystem object.
     *
     * @throws IOException if an I/O error occurs
     */
    public StoreSystem() throws IOException {
        currentUser = new GeneralUser();
        resources = new ItemsManagement();
        users = new UserManagement();
        state = true;
    }

    /**
     * Starts the store system.
     */
    public void start() {
        while (state) {
            mainManu();
        }
    }

    /**
     * Displays the main menu.
     */
    private void mainManu() {
        Scanner input = new Scanner(System.in);
        String ans;
        String secAns;

        System.out.println("---------------------------------------------------------------------");
        if (currentUser instanceof GeneralUser) { // You are a general user
            System.out.println(" >> welcome to our Store << ");
            System.out.println("Main Menu\n" +
                    "1- Register\n" +
                    "2- Login\n" +
                    "3- Display Catalog\n" +
                    "4- Exit");
            ans = input.nextLine();
            if (Objects.equals(ans, "1") || ans.equalsIgnoreCase("register")) {
                ((GeneralUser) currentUser).register(users);
            } else if (Objects.equals(ans, "2") || ans.equalsIgnoreCase("login")) {
                currentUser = ((GeneralUser) currentUser).login(users);
            } else if (ans.equals("3")) {
                resources.viewItems();
            } else {
                // EXIT
                state = false;
            }
        } else { // You are a logged-in user
            System.out.println(" >> Welcome Back " + ((LoggedInUser) currentUser).getUserName() + " <<");
            System.out.println("Main Menu\n" +
                    "1- Display Catalog\n" +
                    "2- Add Item to Cart\n" +
                    "3- Check Out\n" +
                    "4- View Previous Orders\n" +
                    "5- Sign Out\n" +
                    "6- Exit");
            ans = input.nextLine();
            if (Objects.equals(ans, "1") || ans.equalsIgnoreCase("Display")) {
                resources.viewItems();
            } else if (Objects.equals(ans, "2") || ans.equalsIgnoreCase("Add")) {
                System.out.println("Enter Item ID or Name");
                secAns = input.nextLine();
                Item ITEM = resources.getStock().getItemById(secAns);
                ITEM = (ITEM == null ? resources.getStock().getItemByName(secAns) : ITEM);

                if (ITEM == null) {
                    System.out.println("Item Not Found..!");
                } else {
                    System.out.println("Successfully added to your cart ..");
                    ((LoggedInUser) currentUser).addItem(ITEM, 1);
                }


            } else if (ans.equals("3") || ans.equalsIgnoreCase("Check out")) {
                if (!((LoggedInUser) currentUser).isCartEmpty()) {
                    ((LoggedInUser) currentUser).checkOut();
                } else {
                    System.out.println("Empty cart..! Please add items to Checkout");
                }
            } else if (ans.equals("4") || ans.equalsIgnoreCase("view")) {
                ((LoggedInUser) currentUser).printPrevOrders();
            } else if (ans.equals("5") || ans.equalsIgnoreCase("Sign Out")) {
                currentUser = new GeneralUser();
            } else {
                // EXIT
                state = false;
            }


        }

    }
}

