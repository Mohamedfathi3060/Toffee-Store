import java.util.ArrayList;
public class Stock {
    protected ArrayList<Item> items ;
    Stock(){
        items = new ArrayList<>();

    }
    void addItem(Item it){
        items.add(it);
    }
    Item getItem(String ID){
        for (Item item : items) {
            if (item.getItemID() == ID) {
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
