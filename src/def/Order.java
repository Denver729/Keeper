package def;
import java.util.ArrayList;
import com.google.gson.*;


public class Order {
    private static ArrayList<Product> drinks = new ArrayList<Product>();
    private static ArrayList<Product> sandwiches = new ArrayList<Product>();
    private static ArrayList<Product> starters = new ArrayList<Product>();
    private static int total;
    private static int time;
    private static int number;




    public static void addPosit(Drink drnk){
       drinks.add(drnk);
    }
    public static void addPosit(Starter starter){
        starters.add(starter);
    }
    public static void addPosit(Sandwich sandwich){
        sandwiches.add(sandwich);
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
