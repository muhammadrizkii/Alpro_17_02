package ch04;
public class Soal6n {
    public static void main(String[] args) {
        int[] soal = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jumlah =0;
        for (int a : soal) {
            System.out.print(a+" ");
            jumlah=jumlah+a;
        }
        System.out.print("= "+ jumlah);
        
    }
}
    