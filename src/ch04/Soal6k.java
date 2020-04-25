package ch04;
public class Soal6k {
    public static void main(String[] args) {
        int[] soal = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};       
        for (int a = 0; a < soal.length; a++) {
            if (a+1 < soal.length) {
                int selisih = soal[a] - soal[a+1];
                if (selisih < 0) {
                    System.out.println(soal[a]+" ");
                }
            }
        }
    }
    
}