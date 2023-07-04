package estructuras_básicas_de_programación;

/**
 * Ejercicio 1.1
 * 
 * Esta clase denominada Indice IMC calcula el índice de masa corporal de
 * una persona y con base en el resultado indica si tiene un peso normal,
 * inferior o superior al normal u obesidad.
 * 
 * @version 1.0/2020
 * @author David Stiven
 * 
 */
public class IndiceIMC {

    /**
     * Metodo main
     * @param args
     */
    public static void main(String[] args) {

        int masa = 71; // Masa en Kilogramos
        double estatura = 1.78; // Estatura en metros
        double IMC = masa/Math.pow(estatura, 2); /*Calcula el indice de masa corporal */

        System.out.println("La persona tiene una masa = " + masa + " Kilogramos y  estatura = " + estatura + " metros");
        /* Mediante varios if-else anidados se evalúan diferentes rangos del IMC */
        if (IMC < 16) {
            System.out.println("La persona tiene delgadez severa.");
        } else if (IMC < 17) {
            System.out.println("La persona tiene delgadez moderada.");
        } else if (IMC < 18.5) {
            System.out.println("La persona tiene delgadez leve");
        } else if (IMC < 25) {
            System.out.println("La persona tiene peso normal");
        } else if (IMC < 30) {
            System.out.println("La persona tiene sobrepeso");
        } else if (IMC < 35) {
            System.out.println("La persona tiene obesidad leve");
        } else if (IMC < 40) {
            System.out.println("La persona tiene obesidad media");
        } else {
            System.out.println("La persona tiene obesidad mórbida");

        }   
    }

}
