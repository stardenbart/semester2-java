package OOP.Data;

public class Product {
    protected String name;
    protected int price;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public Product(){
        this.name = null;
        this.price = 0;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String toString(){
        return "Product name: " + getName() + ", price: " + getPrice();
    }
}
