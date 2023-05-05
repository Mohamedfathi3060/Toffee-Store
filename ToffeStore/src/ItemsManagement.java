public class ItemsManagement {
    private Stock storeStock;

    ItemsManagement(Stock my){
        storeStock = my;

    }
    ItemsManagement(){
        storeStock = new Stock();
    }
    Stock getStock(){
        return storeStock ;
    }
    boolean deleteItem(Item it ){
        return storeStock.items.remove(it);
    }
    Item deleteItem(int index){
        if(index > 0 && index < storeStock.items.size()) return storeStock.items.remove(index);
        return null;
    }
    void viewItems(){
        for (Item it : storeStock.items){
            viewCard(it);
        }
    }
    private void viewCard(Item it){
        System.out.println("\nID : " +it.getItemID() +", Name : " + it.getName() + ", Price" + it.getPrice() );
        System.out.println("category : " +it.getCategory() +", available : " + (it.isAvailable() ?  "YES" :"NO") + "\n");

    }

}
