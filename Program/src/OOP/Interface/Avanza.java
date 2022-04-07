package OOP.Interface;
//interface inheritance class more than 1
public class Avanza implements Car, Maintenance {
    //override nanti dibahas
    @Override
    public void drive() {
        System.out.println("Drive Avanza");
    }

    @Override
    public int getTier() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return false;    }
    
}
