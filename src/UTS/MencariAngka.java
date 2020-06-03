package UTS;
public class MencariAngka {
    public static void main(String[] args) {
        int[] soal = {92, 12, 51, 38, 29, 26, 19, 48, 10, 55, 28, 32, 5};
	int target = 55;
        for (int a = 0; a < soal.length; a++) {
            if (soal[a]==target) {
                System.out.println(target+" Terdapat pada indeks ke "+a);
            }
        }
    }
}