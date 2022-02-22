public class tesASDL {
    public static void main(String[] args){
        int[] data1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] data2 = {2, 1, 5, 4, 3, 7, 8, 9, 0, 6};
        int[] data3 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int n = 0;
        long start, end;

        //TOTAL WAKTU: 0.020 DETIK

        start = System.currentTimeMillis();
        //0.09 Detik
        for(int i = 0; i < data1.length; i++){
            System.out.print(data1[i] + " ");
            if(data1[i] == 6){
                System.out.println("Data 6 ditemukan.");
            }
        }
        //0.009 Detik
        for(int i = 0; i < data2.length; i++){
            System.out.print(data2[i] + " ");
            n = data2[i];
            if(n == 6){
                System.out.println("Data 6 ditemukan.");
            }
        }
        //0.01 Detik
        for(int i = 0; i < data3.length; i++){
            System.out.print(data3[i] + " ");
            n = data3[i];
            if(n == 6){
                System.out.println("Data 6 ditemukan.");
            }
        }

        end = System.currentTimeMillis();
        System.out.println("Lama waktu berjalan: " + ((end - start) / 1000.0) + " detik");
               
    }
    
}
