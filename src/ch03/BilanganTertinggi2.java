package ch03;
import java.util.Scanner;
public class BilanganTertinggi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai X = ");
        int x = input.nextInt();
        System.out.print("Masukkan Nilai Y = ");
        int y = input.nextInt();
        System.out.print("Masukkan Nilai Z = ");
        int z = input.nextInt();
        
        if (x>y && x>z) {
            System.out.println(x + " Bilangan tertinggi");
        } else if (y>x && y>z) {
            System.out.println(y + " Bilangan tertinggi");
        } else {
            System.out.println(z + " Bilangan Tertinggi");
        }
    }
}