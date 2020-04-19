package ch03;
import java.util.Scanner;
public class BilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan = ");
        int bilangan = input.nextInt();
        int faktor=0;
        for (int a = 1; a <= bilangan; a++) {
            if (bilangan%a==0) {
                faktor++;
            }
        }
        
        if (faktor==2) {
            System.out.println( bilangan + " Bilangan Prima ");
        } else {
            System.out.println( bilangan + " Bukan Bilangan Prima");
        }
    }
}