package View;

import Model.*;
import java.util.ArrayList;
import java.util.Iterator;
import Controller.Validation;

public class FruitList {
    ArrayList <Fruit> fruitList = new ArrayList<>();
    Validation validation = new Validation();
    public Fruit createFruit(){
        Fruit fruit = new Fruit(null, null, 0, 0, null);
        System.out.println("Enter fruit ID: ");
        fruit.setId(validation.checkInputID());
        System.out.println("Enter fruit name:");
        fruit.setName(validation.checkInputString());
        System.out.println("Enter fruit's price: ");
        fruit.setPrice(validation.checkInt());
        System.out.println("Enter quantity: ");
        fruit.setQuantity(validation.checkInt());
        System.out.println("Enter origin:");
        fruit.setOrigin(validation.checkInputString());

        return fruit;
    }


    public void addFruit(){
        while(true){
            fruitList.add(createFruit());
            System.out.println("Do you want to continue(Y/N): ");
            if(!validation.checkInputYN()){
                return;
            }
        }
    }

    public boolean isEmpty(){
        return fruitList.isEmpty();
    }

    public Order shopping(){
        
        ArrayList <Fruit> basket = new ArrayList<>();
        while(true){
            displayList();

            System.out.println("Please choose an item from the list by typing item no. :");
            int choice = validation.checkInt(1, fruitList.size()) - 1;
            System.out.println("Enter quantity: ");
            int quantity = validation.checkQuantity(fruitList.get(choice).getQuantity());
            Fruit fruitBuy = new Fruit(fruitList.get(choice).getId()
                                        , fruitList.get(choice).getName()
                                        , fruitList.get(choice).getPrice()
                                        , quantity, fruitList.get(choice).getOrigin());
            basket.add(fruitBuy);   
            System.out.println("Do you want to order now (Y/N): ");
            if(validation.checkInputYN()){
                System.out.println("Enter your name:");
                Order order = new Order(validation.checkInputString(), basket);
                System.out.println("Thanks for shopping with us!"); 
                fruitList.get(choice).setQuantity(fruitList.get(choice).getQuantity() - quantity);
                checkList();
                return order;
            }else      
                System.out.println("Bye see u again");
                System.out.println("Order canceled. Your items are still in the basket.");
                return new Order("No Order", basket);
                            
        }
    }


    public void checkList(){
        Iterator<Fruit> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            Fruit element = iterator.next();
            if(element.getQuantity() == 0){
                iterator.remove(); // Safely remove the element
            }    
        }
    }


    public void displayList(){
            System.out.println("List of fruits: ");
            System.out.println("| ++ Item ++ | ++ Fruit name ++ | ++ Origin ++ | ++ Price ++ |");
            for(int i = 0; i < fruitList.size();i++){
                System.out.println(" ".repeat(7) + (i + 1) +" ".repeat(7) + fruitList.get(i));
            }

    }
}
