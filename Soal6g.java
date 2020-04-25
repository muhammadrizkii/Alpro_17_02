package ch04;
public class Soal6g {
    public static void main(String[] args) {
        int[] soal = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int a = 0; a < soal.length; a++) {
            if (a+2 < soal.length) {
                int x = soal[a];
                int y = soal[a+1];         
                if (x%5==0 && y%5==0 ) {
                    System.out.print(y+" ");
                }
            }
        }
}
}