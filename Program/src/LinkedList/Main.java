package LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        linkedList llist = new linkedList();
        boolean info = true;
        
        System.out.println("*** DOUBLE LINKED LIST ***");
        System.out.println("1. Manual \n2. Pustaka \n3. Keluar");
        System.out.print("Silahkan pilih [1/2/3]: ");
        int n = input.nextInt();

        if(n == 1){
            System.out.println("\n*** OPERASI DOUBLE LINKED LIST ***");
            System.out.println("1. Tambah Data \n2. Hapus Data \n3. Pencarian/Pengubahan Data \n4. Kembali");
            System.out.print("Silahkan pilih [1/2/3/4]: ");
            int pilihan1 = input.nextInt();

            if(pilihan1 == 1){
                System.out.println("\n*** OPERASI TAMBAH DATA DOUBLE LINKED LIST ***");
                System.out.println("1. Tambah Data Awal \n2. Tambah Data Tengah \n3. Tambah Data Akhir \n4. Cetak Data \n5. Kemnbali");
                System.out.print("Silahkan pilih [1/2/3/4/5]: ");
                int pilihan2 = input.nextInt();

                if(pilihan2 == 1){
                    int y = 1000;
                    do{
                        for(int x = 1; x <= y ; x++){
                            System.out.print("Data ke-" + x + ": ");
                            int data = input.nextInt();
                            llist.insertFirst(llist, data);
                        }

                    }while(info == true);
                    
                }else if(pilihan2 == 2){
                    //llist.insertAfter(list, data, index)
                }
                
            }
        }
        input.close();
    }
    
}
