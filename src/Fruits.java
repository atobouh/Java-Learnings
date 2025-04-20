public class Fruits extends Items{
            private String type;
            public Fruits(String name, int quantity, String type) {
                super(name, quantity);// calling the constructor of the parent class(item)
                this.type = type;
            }
            public String getType() {
                return type;
            }
            @Override
            public String getDescription() {
                return "Fruits{" +
                        "name='" + getName() + '\'' +
                        ", quantity=" + getQuantity() +
                        ", type='" + type + '\'' +
                        '}';
            }
}