import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Shopping_Cart {
    private ArrayList<Item> items;
    private ArrayList<Integer> itemsQuantity;
    private double totalPrice;
    public Shopping_Cart () {
        items = new ArrayList<>();
        itemsQuantity = new ArrayList<>();
    }
    public double calculateTotal() {
        double result = 0;
        for (int i = 0; i < items.size(); i++){
            result += items.get(i).getPrice() * itemsQuantity.get(i);
        }
        result = Math.round(result*100.0)/100.0;
        return result;
    }

    public boolean addItem(Item item, int quantity) {
        if (item.isAvailable()){
            items.add(item);
            itemsQuantity.add(quantity);
            return true;
        }
        System.out.println("Item Not Available");
        return false;
    }
    public  ArrayList<Item> getItems (){
        return items;
    }
    public ArrayList<Integer> getItemsQuantity () {return itemsQuantity;}

    // checkOut in user
    /*public boolean chekOut(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Pay Method to Continue: ");
        System.out.println("1-Cash ");
        String ans = input.nextLine();
        if (ans == "1" || ans.toLowerCase(Locale.ROOT) == "cash") {
            Pay_Method payMethod = new Cash_Method();
            Order order = new Order(cart, userID, payMethod,Address);
            orders.add(order);
            return true;
        }
        else {
            System.out.println("Sorry This Method Not Available Now");
        }
        return false;
    }*/

}
