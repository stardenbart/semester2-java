class toko{
    private String nama;
    private int bolpoin;
    private int pensil;
    private int penghapus;

    private double hargaPensil = 1000;
    private double hargaBolpoin = 2000;
    private double hargaPenghapus = 500;

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getJmlBolpoin(){
        return this.bolpoin;
    }

    public void setJmlBolpoin(int jmlBolpoin){
        this.bolpoin = jmlBolpoin;
    }

    public int getJmlPensil(){
        return this.pensil;
    }

    public void setJmlPensil(int jmlPensil){
        this.pensil = jmlPensil;
    }

    public int getJmlPenghapus(){
        return this.penghapus;
    }

    public void setJmlPenghapus(int jmlPenghapus){
        this.penghapus = jmlPenghapus;
    }

    public double getHargaBolpoin(){
        return this.hargaBolpoin;
    }

    public void setHargaBolpoin(double hargaBolpoin){
        this.hargaBolpoin = hargaBolpoin;
    }

    public double getHargaPensil(){
        return this.hargaPensil;
    }

    public void setHargaPensil(double hargaPensil){
        this.hargaPensil = hargaPensil;
    }

    public double getHargaPenghapus(){
        return this.hargaPenghapus;
    }

    public void setHargaPenghapus(double hargaPenghapus){
        this.hargaPenghapus = hargaPenghapus;
    }
}

public class Main {
    public static void main(String[] args){
        toko ahmad = new toko();
        ahmad.setNama("Ahmad");
        ahmad.setJmlBolpoin(10);
        ahmad.setJmlPensil(10);
        ahmad.setJmlPenghapus(20);

        toko budi = new toko();
        budi.setNama("Budi");
        budi.setJmlBolpoin(5);
        budi.setJmlPensil(30);
        budi.setJmlPenghapus(2);

        System.out.println("Tugas 1 Praktikum Pemrograman Komputer Lanjut.\n");

        System.out.println(ahmad.getNama() + " memiliki total uang sebesar " + hitungTotal(ahmad));
        System.out.println(budi.getNama() + " memiliki total uang sebesar " + hitungTotal(budi));
        
        System.out.println("\nAkhir Program.");
        
    }
    public static double hitungTotal(toko a){
        double bolpoin = a.getHargaBolpoin() * a.getJmlBolpoin();
        double pensil = a.getHargaPensil() * a.getJmlPensil();
        double penghapus = a.getHargaPenghapus() * a.getJmlPenghapus();

        double total = bolpoin + pensil + penghapus;
        return total;
    }
}
