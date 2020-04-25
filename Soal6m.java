package ch04;
public class Soal6m {
    public static void main(String[] args) {
        int[] soal = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int selisih =0;
        
        for (int a = 0; a < soal.length; a++) {
            if (a+1 < soal.length) {
                int selisih1 = soal[a] - soal[a+1];
                if (selisih1 < 0) {
                    selisih1= selisih1 * -1;
                }
                System.out.print(selisih1 + " ");
                selisih = selisih+selisih1;
                
            }
        }
        System.out.println("");
        System.out.print("Total Selisih "+ selisih);
    }
}
    