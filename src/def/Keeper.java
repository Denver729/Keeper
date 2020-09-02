package def;

public class Keeper {
    public static void main(String[] args){
       // Viev.go();

        Order.addPosit(new Drink("BigMAc", 100));
        Order.addPosit(new Sandwich("Cola", 75));
        Order.addPosit(new Starter("Free", 50));
        System.out.println(Order.getOrder());


    }
}
