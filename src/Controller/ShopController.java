package Controller;

import View.*;

public class ShopController extends Menu<String>{
    FruitList fruitList = new FruitList();
    OrderList orderList = new OrderList();

    public ShopController(String title, String[] mChon){
        super(title, mChon);
    }
    @Override
    public void execute(int n){
        switch(n){
            case 1: 
            
                fruitList.addFruit();
            
                    break;

            case 2: 
            
                orderList.displayOrderList();
        
                    break;
            case 3: if(!fruitList.isEmpty()){
                           orderList.addOrder(fruitList.shopping());
                        }else{
                           System.out.println("The list is empty!");
                        }
                    break;
            case 4: System.out.println("Goodbye!");
                    System.exit(0);
            default: System.out.println("Option does not exist!");
                    System.out.println("Please reenter: ");                  
        }
    }
    public static void main(String[] args){
       String[] mChon = {"Create Fruit", "View order", "Shopping (for buyer)", "Exit"};
       ShopController shopController = new ShopController("Fruit Shop", mChon);
       shopController.run();

    }
}
