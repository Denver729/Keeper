package def;

public abstract class Product {
    private static String name = null;
    private static int prise = 0;




public static String getProduct(){
    return name+prise;
}

public final static int getPrise(){
    return prise;
}

public static void setProduct(String nm, int prs){
    name = nm;
    prise = prs;
}



}
