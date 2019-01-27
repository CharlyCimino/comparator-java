
package comparatorjava;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author caemci
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Genero lista de alumnos
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add( new Alumno("Pedro","Fulano",7) );
        alumnos.add( new Alumno("Juan","Mengano",9) );
        alumnos.add( new Alumno("Luis","Sultano",8) );
                
        System.out.println("Listado de alumnos original:");
        System.out.println(alumnos); // Mostrar
        
        System.out.println("\nListado de alumnos ordenado por nombre:");
        Collections.sort(alumnos, Alumno.COMPARATOR_NOMBRE); // Ordenar
        System.out.println(alumnos); // Mostrar
        
        System.out.println("\nListado de alumnos ordenado por apellido:");
        Collections.sort(alumnos, Alumno.COMPARATOR_APELLIDO); // Ordenar
        System.out.println(alumnos); // Mostrar
        
        System.out.println("\nListado de alumnos ordenado por nota:");
        Collections.sort(alumnos, Alumno.COMPARATOR_NOTA); // Ordenar
        System.out.println(alumnos); // Mostrar
    }
    
}
