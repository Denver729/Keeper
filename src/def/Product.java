package def;

public class Product {
    static String name = null;
    static int prise = 0;
    public String getName(){
        return name;
    }

    public static int getPrise(){
        return prise;
    }


    public String getString(int a){
        String nam = a+"x"+name+" "+prise*a;
        return nam;
    }

    public String getString(){

        String nam = name+" "+prise;

        return nam;
    }


}
