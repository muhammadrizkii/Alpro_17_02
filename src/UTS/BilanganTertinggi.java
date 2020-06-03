package ch03;
import java.util.Scanner;
public class BilanganTertinggi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai X = ");
        int x = input.nextInt();
        System.out.print("Masukkan Nilai Y = ");
        int y = input.nextInt();
        
        if (x>y) {
            System.out.println(x + " Bilangan tertinggi");
        } else {
            System.out.println(y + " Bilangan tertinggi");
        }
    }
}
