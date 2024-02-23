package Model;

import java.util.ArrayList;


public class Order {
    private String cName;
    private ArrayList<Fruit> fruits;
    private int total = 0;
    public Order(String cName, ArrayList<Fruit> fruits){
        this.cName = cName;
        this.fruits = fruits;
        for(Fruit fruit : fruits){
            total+= fruit.getAmount();
        }
    }
    
    public ArrayList<Fruit> getFruits() {
        return fruits;
    }
    public String getcName() {
        return cName;
    }
    public int getTotal() {
        return total;
    }
    public void setFruits(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }
    public void setcName(String cName) {
        this.cName = cName;
    }
    
    public void displayOrder(){
        System.out.println("Customer name: " + cName);
        System.out.println("Product | Quantity | Price | Amount");
        for(Fruit fruit : fruits){
            System.out.println(fruit.getName()+ "  ".repeat(3)
             + fruit.getQuantity() + " ".repeat(6)
             + fruit.getPrice() + " ".repeat(5) 
             + fruit.getAmount());
        }
        System.out.println("Total: " + total);
    }
}
