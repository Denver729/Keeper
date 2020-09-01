package def;
import java.util.ArrayList;
import com.google.gson.*;


public class Order {
    private static ArrayList<Product> prod = new ArrayList<Product>();
    private static double time;
    private static int prise;
    private static int number;
    private static int total;

    private static String str;

    public static void addPosit(Drink drink){
       prod.add(drink);
    }
    public static void addPosit(Starter starter){
        prod.add(starter);
    }
    public static void addPosit(Sandwich sandwich){
        prod.add(sandwich);
    }

    public static void start(){


    }

    public static J


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








    public static void clear(){
        time=0;
        number=0;
        total=0;

    }

}
