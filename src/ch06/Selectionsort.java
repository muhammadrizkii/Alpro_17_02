package ch06;
public class Selectionsort {
    public static void main(String[] args) {
        int[] bilangan= {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Array Sebelum Di Sort : ");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print(bilangan[i]+" ");
        }
        System.out.println();
        int i=0;
        while(i<bilangan.length-1){
            int tmp=i;
            for(int j = i+1; j < bilangan.length; j++){
                if( bilangan[j] < bilangan[tmp])
                tmp=j;
            }
            int hlp = bilangan[i];
            bilangan[i]=bilangan[tmp];
            bilangan[tmp]=hlp;
            i++;
        }  
        System.out.println("Array Setelah Di Sort : ");
        for(int k=0; k<bilangan.length; k++){
            System.out.print(bilangan[k]+" ");
        }
    }
}
