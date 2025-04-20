 import java.util.ArrayList;
 
 
 public class Inventory {

    private ArrayList<Items> items;// Naming an array list item
   
    public Inventory(){
        items = new ArrayList<Items>(); // Initialize the array list item
    }

    public void AddItem(Items item){
        items.add(item); // Add item to the array list
    }
    
    public void displayItems(){
        for(Items items:items){
            System.out.println(items.getName() + " - " + items.getQuantity());
        }
    }
}
