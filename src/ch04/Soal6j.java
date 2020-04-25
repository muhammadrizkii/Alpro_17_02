package ch04;
public class Soal6j {
    public static void main(String[] args) {
        int[] soal = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};       
        for (int a = 0; a < soal.length; a++) {
            if (a+1 < soal.length) {
                int b = soal[a];
                int c = soal[a+1];
                if (b % 2 == 0 && c % 2 == 0) {
                    int selisih = b - c;
                    if (selisih <0 ) {
                        selisih = selisih * -1;
                    }
                    System.out.println(selisih+"("+b+"-"+c+")");
                }
            }
        }
    }
    
}