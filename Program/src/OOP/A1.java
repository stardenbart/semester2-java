package OOP;

public class A1 {
    public int x;
    int y;
    private int z;

    public A1(){
        x = 1;
        y = 2;
        z = 3;
    }

    public int getx(){
        return x;
    }

    int gety(){
        return y;
    }

    private int getz(){
        return z;
    }

    public static void main(String[] args){
        A1 a = new A1();
        System.out.println(a.getx());
        System.out.println(a.gety());
        System.out.println(a.getz());
    }
}
