package ch06;
public class Bubblesort {
    public static void main(String[] args) {
        int[] bilangan = {82,12,41,38,19,26,9,48,20,55,8,32,3};		
        System.out.println("Array Sebelum Di Sort : ");
            for(int i = 0; i<bilangan.length; i++) {
                System.out.print(" "+bilangan[i]);
            }
	System.out.println();
	System.out.println("Array Sesudah Di Sort : ");
            for(int i = (bilangan.length-1); i>0; i--) {
		for(int j = 0; j<i; j++) {
                    if(bilangan[j]>bilangan[(j+1)]) {
			int swap = bilangan[(j+1)];
			bilangan[(j+1)] = bilangan[j];
                        bilangan[j] = swap;
                    }
		}
            }
            for(int i = 0; i<bilangan.length; i++) {
		System.out.print(" "+bilangan[i]);  
            }
	}
}    
