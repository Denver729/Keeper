package def;

public abstract class Product {
    private static String name;
    private static int prise;




public static String getProduct(){
    return name+prise;
}

public static void setProduct(String nm, int prs){
    name = nm;
    prise = prs;
}



}
