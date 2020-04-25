package ch04;
public class Soal6l {
    public static void main(String[] args) {
        int[] soal = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};       
        for (int a = 0; a < soal.length; a++) {
            int b = soal[a];
            int c = soal[a+1];
            int jumlah = b+c;
            if (jumlah % 2 == 0) {
                System.out.println(jumlah+"("+b+"+"+c+")");
            }
        }
    }
    
}