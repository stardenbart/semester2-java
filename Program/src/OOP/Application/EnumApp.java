package OOP.Application;

import OOP.Data.Customer;
import OOP.Data.Level;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Farauk");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelString = Level.STANDARD.name();
        Level level = Level.valueOf("STANDARD");
        Level[] values = Level.values();

        System.out.println("\nKonversi Enum Class\n");
        System.out.println(levelString);
        System.out.println(level);
        System.out.println(values);

        System.out.println("\nValues Enum Class\n");
        for (var object : Level.values()){
            System.out.println(object);
        }

        int[] angka = {20, 21, 21, 22, 23};

        for (int number : angka){
            System.out.print(number + ", ");
        }
    }
}
