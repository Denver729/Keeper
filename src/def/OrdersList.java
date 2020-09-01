package def;

import java.util.ArrayList;

public class OrdersList {
     static  private ArrayList<Order> orders = new ArrayList<Order>();


    static void add(Order a){
        orders.add(a);
        Order.clear();


    }
    static Order drop(int a){
        //
        return orders.get(a);
    }

}
