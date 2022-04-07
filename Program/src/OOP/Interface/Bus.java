package OOP.Interface;

public class Bus implements Car {

    @Override
    public void drive() {
        System.out.println("Bus Drive");
    }

    @Override
    public int getTier() {
        return 10;
    }

    @Override
    public String getBrand() {
        return "Mitsubishi";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

    @Override
    public boolean isBig() {
        return true;
    }
    
}
