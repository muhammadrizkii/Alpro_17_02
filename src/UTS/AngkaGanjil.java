package UTS;
public class AngkaGanjil {
    public static void main(String[] args) {
        int[] soal = {92, 12, 51, 38, 29, 26, 19, 48, 10, 55, 28, 32, 5};
        for (int a:soal) {
            if (a % 2 == 1) {
                System.out.print(a+" ");
            }
        }
    }
}