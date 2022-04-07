package OOP.Data;

public class ProductApp {
    public static void main(String[] args){
        Product product = new Product("MacBook Pro", 30000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product.getName());
        System.out.println(product.getPrice());

        System.out.println(product);

    }
    
}
