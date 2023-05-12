import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Shopping_Cart {
    private ArrayList<Item> items;
    private ArrayList<Integer> itemsQuantity;
    private double totalPrice;
    // assign a memory space to the items and itemsQuantity list
    public Shopping_Cart () {
        items = new ArrayList<>();
        itemsQuantity = new ArrayList<>();
        totalPrice = 0;
    }
    // calculate the total price of the items in the cart
    public double calculateTotal() {
        for (int i = 0; i < items.size(); i++){
            totalPrice += items.get(i).getPrice() * itemsQuantity.get(i);
        }
        // to restrict the result to two digit after the fraction mark
        totalPrice = Math.round(totalPrice*100.0)/100.0;
        return totalPrice;
    }
    // add item with specific quantity to the cart

    public boolean addItem(Item item, int quantity) {
        if (item.isAvailable()){
            items.add(item);
            itemsQuantity.add(quantity);
            return true;
        }
        System.out.println("Item Not Available");
        return false;
    }
    // get cart items list
    public  ArrayList<Item> getItems (){
        return items;
    }
    // get cary itemsQuantity list
    public ArrayList<Integer> getItemsQuantity () {return itemsQuantity;}

}
