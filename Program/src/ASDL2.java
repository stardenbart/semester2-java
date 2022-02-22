

import java.util.Scanner;

public class ASDL2 {
    public static void main(String[] args){
        System.out.println("Program Kamus (ASDL).");
        Scanner input = new Scanner(System.in);
        boolean n = true;
        String IND[] = {"kue", "rumah", "nomor", "kursi", "meja", "nasi", "lantai", "dinding", "tas", "buku"};
        String ENG[] = {"cake", "house", "number", "chair", "table", "rice", "floor", "wall", "bag", "book"};

        System.out.println("Ketik 'stop' untuk menghentikan");

        do{
            System.out.print("Masukkan kata: ");
            String kamus = input.next();
            //boolean x = true;
                     
                for(int i = 0; i < 10; i++){
                    do{
                        if(kamus.equals(IND[i])){
                            System.out.print(IND[i] + " adalah " + ENG[i] + "\n");
                            
                        }
                        else if(kamus.equals(ENG[i])){
                            System.out.print(ENG[i] + " means " + IND[i] + "\n");
                            
                        }
                        else if(kamus.equals("stop")){
                            System.out.println("\nAnda telah mengakhiri program.");
                            System.out.println("Akhir Program.");
                            n = false;
                            break;
                        }else if(kamus != IND[i] || kamus != ENG[i]){
                            //x = false;
                        }
                        
                    }while(n = true);    
                }
               
            }while(n != false);
        
        input.close();    
    }
}
