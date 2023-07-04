package ejercicios_propuestos;

/**
 * Ejercicios propuestos
 * Agregar dos nuevos atributos a la clase Persona. Un atributo que
represente el país de nacimiento de la persona (de tipo String) y
otro que identifique el género de la persona, el cual debe represen-
tarse como un char con valores 'H' o 'M'.
 * Modificar el constructor de la clase Persona para que inicialice es-
tos dos nuevos atributos.
 * Modificar el método imprimir de la clase Persona para que mues-
tre en pantalla los valores de los nuevos atributos.
 * 
 */
public class Persona {

    String nombre;
    String apellido;
    int numero_documento;
    int anhio_nacimiento;
    String paisNacimiento;
    char genero;

    
    public Persona(String nombre, String apellido, int numero_documento, int anhio_nacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_documento = numero_documento;
        this.anhio_nacimiento = anhio_nacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    void imprimir() {
        System.out.println();
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Numero documento = " + numero_documento);
        System.out.println("Año de nacimiento = " + anhio_nacimiento);
        System.out.println("Pais de nacimiento = " + paisNacimiento);
        System.out.println("Genero =  " + genero);
    }
    
    
    public static void main(String[] args) {
        Persona david = new Persona("David", "Perlaza", 1234567, 1993, "Colombia", 'H');

        Persona alice = new Persona("Alice", "Cifuentes", 1234567, 1993, "Colombia", 'M');

        david.imprimir();

        alice.imprimir();
    }
}
