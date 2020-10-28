
package comparatorjava;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author caemci
 * @see https://github.com/caemci
 */
public class Principal {

    public static void main(String[] args) {
        // Genero lista de alumnos
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add( new Alumno("Juan","Fulano",9) );
        alumnos.add( new Alumno("Pedro","Mengano",7) );
        alumnos.add( new Alumno("Ana","Merez",8) );
        alumnos.add( new Alumno("Maria","Perez",6) );
        alumnos.add( new Alumno("Luis","Sultano",8) );
                
        System.out.println("Listado de alumnos original");
        UtilCollections.mostrarColeccion(alumnos); // Mostrar
        
        System.out.println("\nListado de alumnos ordenado por nombre");
        Collections.sort(alumnos, Alumno.COMPARATOR_NOMBRE); // Ordena por nombre de forma ascendente
        UtilCollections.mostrarColeccion(alumnos); // Mostrar
        
        System.out.println("\nListado de alumnos ordenado por apellido");
        Collections.sort(alumnos, Alumno.COMPARATOR_APELLIDO); // Ordena por apellido de forma ascendente
        UtilCollections.mostrarColeccion(alumnos); // Mostrar
        
        System.out.println("\nListado de alumnos ordenado por nota");
        Collections.sort(alumnos, Alumno.COMPARATOR_NOTA); // Ordena por nota de forma ascendente
        UtilCollections.mostrarColeccion(alumnos); // Mostrar
    }
    
}
