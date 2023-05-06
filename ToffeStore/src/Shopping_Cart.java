import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Shopping_Cart {
    private ArrayList<Item> items;
    private double totalPrice;
    public double calculateTotal() {
        double result = 0;
        for (Item item:
             items) {
            result += item.getPrice();
        }
        return result;
    }

    public boolean addItem(Item item) {
        if (item.isAvailable()){
            items.add(item);
            return true;
        }
        return false;
    }
    public  ArrayList getItems (){
        return items;
    }

    // checkOut in user
    public boolean chekOut(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Pay Method to Continue: ");
        System.out.println("1-Cash ");
        String ans = input.nextLine();
        if (ans == "1" || ans.toLowerCase(Locale.ROOT) == "cash") {
            Pay_Method payMethod = new Cash_Method();
            Order order = new Order(cart, userID, payMethod,Address);
            orders.add(order);
            payMethod.Redeem();
            System.out.println("Order Taken Successfully");
            return true;
        }
        else {
            System.out.println("Sorry This Method Not Available Now");
        }
        return false;
    }

}
