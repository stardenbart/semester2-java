package OOP.Data;

public class Application {

    public static final int PROCESSOR;

    static {
        System.out.println("Mengakses class Application");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
