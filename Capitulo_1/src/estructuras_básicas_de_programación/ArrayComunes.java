package estructuras_básicas_de_programación;

/**
 * Desarrollar un programa que busque elementos comunes en dos
arrays de enteros.
 *
 * @author David Stiven
 * 
 */
public class ArrayComunes {

    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5,11,8,12};
        int[] b = {3,4,5,6,8,12};

        ArrayComunes comunes = new ArrayComunes();

        comunes.Comparar(a,b);
    }

    private void Comparar(int[] x, int[] y) {
        System.out.println("\n Los numeros repetidos en los Arreglos\n");

        for(int a : x) {
            for(int b : y){
                if (a == b) {
                    System.out.println("["+a+"]");
                }

            }
        }
    }
}
