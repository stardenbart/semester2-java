package OOP.Encapsulation;

public class CategoryApp {
    public static void main(String[] args){
        Category category = new Category();

        category.setId("Farauk");
        category.setExpensive(true);
        System.out.println(category.getId());
        System.out.println(category.isExpensive());

        category.setId(null);
        System.out.println(category.getId());
    }
    
}
