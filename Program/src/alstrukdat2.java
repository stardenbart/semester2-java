import java.util.Scanner;

public class alstrukdat2{
    public static void main(String[] args){
        System.out.println("Program Mencari Nilai.");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        int b = input.nextInt();

        System.out.println("Maka hasil penjumlahannya adalah " + penjumlahan(a, b));

        System.out.print("Masukkan nilai ketiga: ");
        int c = input.nextInt();

        input.close();  

        perbandinganNilai(a, b, c);
    }

    private static int penjumlahan(int a, int b){ 
        return a + b;
    }

    private static void perbandinganNilai(int a, int b, int c){
        if(a > b && a > c){
            System.out.println(a + " adalah nilai terbesar.");
        }else if (b > a && b > c){
            System.out.println(b + " adalah nilai terbesar.");
        }else {
            System.out.println(c + " adalah nilai terbesar.");
        }
            
    }
}