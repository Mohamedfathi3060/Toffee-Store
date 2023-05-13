import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
/**
 * This class represents a stock of items.
 * @author mohamed Fathi
 */
public class Stock {

    /**
     * The list of items in the stock.
     */
    protected ArrayList<Item> items;

    /**
     * Constructs a new Stock object.
     * The stock will be loaded from the file "items.csv".
     */
    public Stock() throws IOException {
        items = new ArrayList<>();

            loadFromFile();

        }


    /**
     * Adds the specified item to the stock.
     *
     * @param it The item to add.
     */
    public void addItem(Item it) {
        items.add(it);
    }

    /**
     * Loads the items from the file "items.csv" into the stock.
     *
     * @throws FileNotFoundException If the file "items.csv" cannot be found.
     * @throws IOException If an I/O error occurs while reading the file "items.csv".
     */
    public void loadFromFile() throws FileNotFoundException, IOException {
        final String path = "items.csv";
        BufferedReader b  = new BufferedReader(new FileReader(path));
        String line ;
        while ((line = b.readLine()) != null){
            String[] val = line.split(",");
            Item x = new Item(val[0] , val[1] , val[2] , Double.parseDouble(val[3]),val[4].equalsIgnoreCase("yes"));
            addItem(x);
        }
        b.close();
    }

    /**
     * Gets the item with the specified ID from the stock.
     *
     * @param ID The ID of the item to get.
     * @return The item with the specified ID, or null if the item is not found.
     */
    public Item getItemById(String ID) {
        for (Item item : items) {
            if (Objects.equals(item.getItemID(), ID)) {
                return item;
            }
        }
        return null;
    }

    /**
     * Gets the item with the specified name from the stock.
     *
     * @param NAME The name of the item to get.
     * @return The item with the specified name, or null if the item is not found.
     */
    public Item getItemByName(String NAME) {
        for (Item item : items) {
            if (Objects.equals(item.getName(), NAME)) {
                return item;
            }
        }
        return null;
    }

}
