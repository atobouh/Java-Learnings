public class Weapon extends Items {
       
    private String type;
    private int damage;

    public Weapon(String name, int quantity, String type1, int damage) {
        super(name, quantity); // calling the constructor of the parent class(item)
        type = type1;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }  
    @Override 
    public String getDescription() {
        return "Weapon{" +
                "name='" + getName() + '\'' +
                ", quantity=" + getQuantity() +
                ", type='" + type + '\'' +
                ", damage=" + damage +
                '}';
    }
}
