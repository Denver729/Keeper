package def;
import java.util.ArrayList;
import java.util.Date;

import com.google.gson.*;


public class Order {
    private static ArrayList<Product> drinks = new ArrayList<Product>();
    private static ArrayList<Product> sandwiches = new ArrayList<Product>();
    private static ArrayList<Product> starters = new ArrayList<Product>();
    private static int total;
    private static double time;
    private static int number;



    // overloaded method for adding products of different types with a type parameter "Product"
    public static void addPosit(Drink drnk){
        if(drinks.isEmpty()&sandwiches.isEmpty()&starters.isEmpty()){
            initOrd();
        }
       drinks.add(drnk);
        total += drnk.getPrise();
    }

    //.................................................

    public static void addPosit(Starter starter){
        if(drinks.isEmpty()&sandwiches.isEmpty()&starters.isEmpty()){
            initOrd();
        }
        starters.add(starter);
        total += starter.getPrise();
    }

    //.................................................

    public static void addPosit(Sandwich sandwich){
        if(drinks.isEmpty()&sandwiches.isEmpty()&starters.isEmpty()){
            initOrd();
        }
        sandwiches.add(sandwich);
        total += sandwich.getPrise();
    }

    //get Order Number from OrdersList.....

    private static void initOrd(){
        Date date = new Date();
        number = OrdersList.getNumb();
        time = date.getTime();
    }




    public static String getOrder(){
        Gson GSON = new GsonBuilder().setPrettyPrinting().create();
        String str = GSON.toJson(Order.sandwiches)+GSON.toJson(Order.starters)+GSON.toJson(Order.drinks);
        return str;
    }

  public static void clear(){
        time=-1;
        number=-1;
        total=-1;

    }

    /*private synchronized void timeWolk(){
        new Thread(()->{
            while(time<1000){
                time++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }*/









}
