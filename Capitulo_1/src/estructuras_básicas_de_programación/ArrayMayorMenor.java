package estructuras_básicas_de_programación;

import java.util.Arrays;

public class ArrayMayorMenor {
    public static void main(String[] args) {
        int[] array = {2,100,3,12,39,-10002,34};
        int mayor = 0, menor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero mayor es: " + mayor);
        
        
        
        
        
        
        
        
        
        
        
        
        // Arrays.sort(array);
        // for (int n : array) {
        //     System.out.println(n);
        // }



        
        
        // System.out.println("Elemetos del Array");

        // for (int i = 0; i < array.length; i++) {
        //     System.out.println("Elemento [" + i + "] = " + array[i]);
        // }
        // for (int i = 0; i < array.length -1; i++) {
        //     for(int j = i; j < array.length; j++) {

        //         if ((array[i] == array[j])) {
                    
        //         }
        //     }
        //  }
    }

}
