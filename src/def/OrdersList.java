package def;

import java.util.ArrayList;

public class OrdersList {
     static  private ArrayList<Order> orders = new ArrayList<Order>();


    static void push(Order a){
        orders.add(a);
        Order.clear();


    }
    static Order pop(int a){
        //
        return orders.get(a);
    }

}
