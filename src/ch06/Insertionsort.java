package ch06;
public class Insertionsort {
    public static void main(String[] args) {
        int[] bilangan= {82,12,41,38,19,26,9,48,20,55,8,32,3}; 	
        System.out.println("Array Sebelum Di Sort : ");
        for (int i = 0; i < bilangan.length; i++) {           
            System.out.print(bilangan[i]+ " ");
        }
        System.out.println();        	
        for(int i = 0 ; i < bilangan.length; i++) {
            int min=bilangan[i];
            int j=i;
                while( (j > 0) && (min < bilangan[j-1]) ) {
                    bilangan[j]=bilangan[j-1];
                    j--;
                }
            bilangan[j]=min;
        }        
        System.out.println("Array Setelah Di Sort : ");
        for(int j = 0; j < bilangan.length; j++){
            System.out.print(bilangan[j]+" ");
        }
    }
}
