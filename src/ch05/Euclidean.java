package ch05;
import java.util.Scanner;
public class Euclidean {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Pertama = ");
        int bil1 = Input.nextInt();
        System.out.print("Masukkan Bilangan Kedua = ");
        int bil2 = Input.nextInt();
        
        int a = bil2 % bil1;
        while( a != 0 ) {
            bil1 = bil2;
            bil2 = a;
            a = bil1 % bil2;
        }
        System.out.println("FPB = " + bil2 );
    }
}