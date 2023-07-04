package estructuras_básicas_de_programación;

import java.util.Scanner;

/**
 * Desarrollar un programa que, dado un número entero, busque dicho número en un array.
 * 
 * @author David Stiven
 */
public class BuscarArray {
    // public static void main(String[] args) {

        
    //     Scanner entrada = new Scanner(System.in);
    //     int arreglo[], numero;
    //     boolean creciente = true;
        
    //     arreglo = new int[10];

    //     do {
    //         // pedimos el arreglo
    //         System.out.println("Rellene el arreglo");
    //         for(int i = 0; i < 10; i++) {
    //             System.out.println(i + ". Digite un numero; ");
    //             arreglo[i] = entrada.nextInt();
    //         }
    //         // verificar si el arreglo esta ordenado
    //         for (int i = 0; i < 9; i ++) {
    //             if (arreglo[i] < arreglo[i + 1])  { // crecient: 1-2-3...
    //                 creciente = true;
    //             }
    //             if (arreglo[i] > arreglo[i + 1]) { // decrecient: 1-2-3...
    //                 creciente = false;
    //                 break;
    //             }
    //         }

    //         if (creciente == false) {
    //             System.out.println("\nEl arreglo esta desordenado, digite nuevamente: ");
    //         }
    //     } while (creciente == false);

    //     // Pedimos el numero a buscar
    //     System.out.println("\nDigite el numero a buscar en el arreglo");
    //     numero = entrada.nextInt();

    //     // Buscamos el numero en el arreglo
    //     int i = 0;

    //     while (i < 10 && arreglo[i] < numero) {
    //         i++;
    //     }

    //     if(i == 10) {
    //         System.out.println("\nNumero no encontrado");
    //     }
    //     else{
    //         if (arreglo[i] == numero) {
    //             System.out.println("\nNumero encontrado, en la posicion: " + i);
    //         }
    //         else {
    //             System.out.println("\nNumero no encontrado");
    //         }
    //     }
    // }



    // OPCION 1


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("\nDigite el numero a buscar en el arreglo: \n");
        numero = teclado.nextInt();
        

        int[] arreglo = {1,2,3,4,5,6,7,8,9, 10};

        int i = 0;

        while (i < 10 && arreglo[i] < numero) {
            i++;
        }
        if (i == 10) {
            System.out.println("\nNumero no encontrado");
        }
        else {
            if (arreglo[i] == numero) {
                System.out.println("\nNumero encontrado, en la posicion: " + i);
            }
            else{
                System.out.println("\nNumero no encontrado");
            }
        }
        
    }
}
