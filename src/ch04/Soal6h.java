package ch04;
public class Soal6h {
    public static void main(String[] args) {
        int[] soal = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int total =0;
        
        for (int a = 0; a < soal.length; a++) {
            total=total+soal[a];
        }
        System.out.println(total);
	}
}