public class Tugas1Praktikum{
    public static void main(String[] args){
        System.out.println("Tugas 1 Praktikum Pemrograman Komputer Lanjut.");
        System.out.println();

        class Properti{
            private String nama;
            private int bolpoin;
            private int pensil;
            private int penghapus;

            private int hargaPensil = 1000;
            private int hargaBolpoin = 2000;
            private int hargaPenghapus = 500;

            public int total(int a, int b, int c){
                int total = (a * hargaPensil) + (b * hargaBolpoin) + (c * hargaPenghapus);
                return total;
            }
        }

    Properti ahmad = new Properti();
    ahmad.nama = "Ahmad";
    ahmad.bolpoin = 10;
    ahmad.pensil = 10;
    ahmad.penghapus = 20;
    int totalAhmad = ahmad.total(ahmad.pensil, ahmad.bolpoin, ahmad.penghapus);


    Properti budi = new Properti();
    budi.nama = "Budi";
    budi.bolpoin = 5;
    budi.pensil = 30;
    budi.penghapus = 2;
    int totalBudi = budi.total(budi.pensil, budi.bolpoin, budi.penghapus);

    System.out.println(ahmad.nama + " memiliki total uang sebesar " + totalAhmad);
    System.out.println(budi.nama + " memiliki total uang sebesar " + totalBudi);

    System.out.println();
    System.out.println("Akhir Program.");

    }
             
}