package def;

import java.util.ArrayList;

public class OrdersList {
     static  private ArrayList<String> orders = new ArrayList<String>();


    static void add(Order a){
        orders.add(Order.getOrder());
        Order.clear();


    }

    public static int getNumb(){
        return orders.size();
    }



}
