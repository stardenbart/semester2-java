package OOP.Interface;

public class CarApp {
    public static void main(String[] args){
        //jangan menggunakan new car karena sama seperti abstract
        //tidak bisa diinstansiasikan kembali
        Car car = new Avanza();
        car.drive(); 
        System.out.println(car.getTier());

        //n.b: kontrak gunakan interface jangan abstract
    }
}
