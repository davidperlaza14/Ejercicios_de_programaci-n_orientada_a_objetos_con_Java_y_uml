package estructuras_básicas_de_programación;

/**
 * Ejercicio 1.4. Estructura repetitiva for
 * 
 * Esta clase denominada Números amigos determina si una pareja de
 * números son amigos. Dos números enteros positivos son amigos si la
 * suma de los divisores propios de un número es igual al otro número
 * y viceversa.
 * 
 * @version 06/2023
 * @author David Stiven
 * 
 */
public class NúmerosAmigos {

    /**
     * Metodo main
     * 
     * @param args
     */
    public static void main(String[] args) {

        int suma = 0; // Variable que sumara los divisores de un numero
        int numero1 = 220; // Definicion del primer numero
        int numero2 = 284; // Definicion del segundo numero

        // Suma todos los divisores del numero 1
        for (int i = 1; i < numero1; i++) {
            if (numero1 % i == 0) {
                suma = suma + i;
            }
        }

        // Si la suma de los divisores del numero 1 es igual al numero 2
        if (suma == numero2) {
            suma = 0;
            // Suma los divisores del numero 2
            for (int i = 1; i < numero2; i++) {
                if (numero2 % i == 0) {
                    suma = suma + i;
                }
            }

            // Si la suma de los divisores de ambos numeros son iguales
            if (suma == numero1) {
                System.out.println(numero1 + " y " + numero2 + " son amigos");

            } else {
                System.out.println(numero1 + " y " + numero2 + " no son amigos");

            }
        } else {
            System.out.println(numero1 + " y " + numero2 + " no son amigos");
        }

    }
}
