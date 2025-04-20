import java.util.ArrayList;

public class Inventory {
    private ArrayList<Items> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Items item) {
        items.add(item);
    }

    public void displayItems() {
        for (Items item : items) {
            System.out.println(item.getDescription());
        }
    }
}