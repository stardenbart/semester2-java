import java.util.Scanner;

public class Alstrukdat1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        long n = input.nextLong();

        long start, end;

        start = System.currentTimeMillis();

        /* long sum = 0l;
        for(long i = 1; i <= n; i++){
            sum = (sum + i);
        } */

        long sum1 = n * (n + 1) / 2;

        //System.out.println(sum);
        System.out.println(sum1);

        System.out.println("Akhir Program.");
        input.close();

        end = System.currentTimeMillis();
        System.out.println("Lama program berjalan " + ((end - start) / 1000.0) + " detik");
    }
}
