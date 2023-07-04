package clases_objeto;


/**
 * Esta clase define objetos de tipo Persona con un nombre, apellidos,
 * número de documento de identidad y año de nacimiento.
 * 
 * @author David Stiven
 * 

*/
public class Persona {
    String nombre;
    String apellido;
    int numero_documento;
    int anhio_nacimiento;



    /**
     * @param nombre Parámetro que define el nombre de la persona
     * @param apellidos Parámetro que define los apellidos de la persona
     * @param númeroDocumentoIdentidad Parámetro que define el
     * número del documento de identidad de la persona
     * @param añoNacimiento Parámetro que define el año de nacimiento
     * de la persona
     * Constructor de la clase Persona
     * 
*/
    public Persona(String nombre, String apellido, int numero_documento, int anhio_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_documento = numero_documento;
        this.anhio_nacimiento = anhio_nacimiento;
    }

    /**
     * Metodo que imprime en pantalla los datos de una persona
     */
    void imprimir() {
        System.out.println();
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Número de documento de identidad = " + numero_documento);
        System.out.println("Año de nacimiento = " + anhio_nacimiento);
        System.out.println();
    }


    /**
     *
     * Método main que crea dos personas e imprime sus datos en pantalla
     * 
     * */

    public static void main(String[] args) {

        Persona david = new Persona("David Stiven", "Perlaza Valencia", 123456789, 1993);

        Persona alice = new Persona("Alice Fernanda", "Cifuentes Caicedo", 123456789, 1999);

        david.imprimir();
        alice.imprimir();
        
        
    }

    

    
}
