package ch04;
public class Soal6b {
    public static void main(String[] args) {
        int[] soal = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
	int target = 9;
        for (int a = 0; a < soal.length; a++) {
            if (soal[a]==target) {
                System.out.println(target+" Terdapat pada indeks ke "+a);
            }
        }
    }
}