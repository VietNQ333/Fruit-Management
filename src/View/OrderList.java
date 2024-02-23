package View;

import Model.*;
import java.util.ArrayList;

public class OrderList {
    ArrayList <Order> orderList = new ArrayList<>();

    public void addOrder(Order order){
        orderList.add(order);
    }

    public boolean isEmpty(){
        return orderList.isEmpty();
    }
    public void displayOrderList(){
            System.out.println("<>==<> Order list <>==<>");
            if(!orderList.isEmpty()){
                for(Order order : orderList){
                order.displayOrder();
            }
            }else{
                System.out.println("The list is empty!");
            }
            
    
    }
}
