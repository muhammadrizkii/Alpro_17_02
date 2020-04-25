package ch04;
public class Soal6c {
    public static void main(String[] args) {
        int[] soal = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int a:soal) {
            if (a % 2 == 1) {
                System.out.print(a+" ");
            }
        }
    }
}