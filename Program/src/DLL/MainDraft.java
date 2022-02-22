package DLL;

import java.util.Scanner;

public class MainDraft {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DLL llist = new DLL();
        int pilihan;

        do{
            System.out.println("*** OPERASI TAMBAH DATA DOUBLE LINKED LIST ***");
            System.out.println("    1. Tambah Data Awal" + 
                            "\n    2. Tambah Data Tengah" + 
                            "\n    3. Tambah Data Akhir" + 
                            "\n    4. Cetak Data" + 
                            "\n    5. Kembali");
            System.out.print("    Silahkan Pilih (1/2/3/4/5): ");
            pilihan = input.nextInt();
            boolean sign = true;

            switch(pilihan){
                case 1:
                System.out.println("\n*** OPERASI TAMBAH DATA AWAL DOUBLE LINKED LIST ***");
                System.out.println("\n    INFO: - Masukkan data angka (Integer) \n\t  - Input 0 untuk kembali ke menu sebelumnya\n");
                do{
                    for(int i = 1; i <= 100000000; i++){
                            System.out.print("    Data ke-" + i + ": ");
                            int d = input.nextInt();
                            llist.push(d);
                        if(d == 0){ 
                            sign = false; 
                            break;
                        }
                    }
                    System.out.println();
                }while(sign == true);
                break;

                case 2:
                System.out.println("\n*** OPERASI TAMBAH DATA TENGAH DOUBLE LINKED LIST ***");
                System.out.println("\n    INFO: - Masukkan data angka (Integer) \n\t  - Input 0 untuk kembali ke menu sebelumnya\n");
                do{
                    for(int i = 1; i <= 100000000; i++){
                            System.out.print("    Data ke-" + i + ": ");
                            int d = input.nextInt();
                            llist.InsertAfter(llist.head.next, d);
                        if(d == 0){ 
                            sign = false; 
                            break;
                        }
                    }
                    System.out.println();
                }while(sign == true);
                break;

                case 3:
                System.out.println("\n*** OPERASI TAMBAH DATA AKHIR DOUBLE LINKED LIST ***");
                System.out.println("\n    INFO: - Masukkan data angka (Integer) \n\t  - Input 0 untuk kembali ke menu sebelumnya\n");
                do{
                    for(int i = 1; i <= 100000000; i++){
                            System.out.print("    Data ke-" + i + ": ");
                            int d = input.nextInt();
                            llist.append(d);
                        if(d == 0){ 
                            sign = false; 
                            break;
                        }
                    }
                    System.out.println();
                }while(sign == true);
                break;

                case 4:
                System.out.println("\n*** CETAK DATA DOUBLE LINKED LIST ***\n");
                llist.printlist(llist.head);
                System.out.println("\n    INFO: - Input 0 untuk kembali ke menu sebelumnya");
                    input.nextInt();
                break;
            }
        }while(pilihan != 0);
        input.close();
    }
    
}
