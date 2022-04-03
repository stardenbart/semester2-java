package UTSPEMKOM;

public class Fan {

    final static int SLOW = 1;

    final static int MEDIUM = 2;

    final static int FAST = 3;

    private int speed;

    private boolean on;

    private double radius;

    private String color;


    /* public int getSLOW() {
        return this.SLOW;
    }


    public int getMEDIUM() {
        return this.MEDIUM;
    }


    public int getFAST() {
        return this.FAST;
    } */


    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "biru";
    }

    public void to_String() {
        if(this.on){
            System.out.println("Kecepatan : " + this.speed +"\nWarna : " + this.color + "\nRadius : " + this.radius);
        } else {
            System.out.println("Warna : " + this.color + "\nJari-jari : " + this.radius + "\nKipas mati");
        }
    }

    public static void main(String[] args) {
        Fan k1 = new Fan();
        System.out.println("KIPAS 1");
        k1.setSpeed(Fan.FAST);
        k1.setRadius(10);
        k1.setColor("kuning");
        k1.setOn(true);
        k1.to_String();

        System.out.println("\nKIPAS 2");
        Fan k2 = new Fan();
        k2.setSpeed(Fan.MEDIUM);
        k2.setRadius(5);
        k2.setColor("biru");
        k2.setOn(false);
        k2.to_String();
    }

}
