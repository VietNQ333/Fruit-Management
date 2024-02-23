package Model;

public class Fruit {
    
    private String id;
    private String name;
    private int price;
    private int quantity;
    private String origin;
    private int amount;
    public Fruit(String id, String name, int price, int quantity, String origin){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
        this.amount = quantity * price;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getOrigin() {
        return origin;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public int getAmount(){
        return amount;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return name +" ".repeat(15) + origin +" ".repeat(10) + "  " + price;
    }
}
