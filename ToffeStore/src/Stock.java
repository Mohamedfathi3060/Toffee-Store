import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;


public class Stock {
    protected ArrayList<Item> items ;
    Stock(){
        items = new ArrayList<>();
        loadFromFile();

    }
    void addItem(Item it){
        items.add(it);
    }
    void loadFromFile(){
        try{

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
        catch (FileNotFoundException e){
            System.out.println("here");
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    Item getItem(String ID){
        for (Item item : items) {
            if (Objects.equals(item.getItemID(), ID)) {
                return item;
            }
        }
        return null ;
    }
    Item getItem(int index){
        if(index > 0 && index <items.size()) return items.get(index);
        else return null;
    }


}
