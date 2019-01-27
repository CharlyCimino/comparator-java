
package comparatorjava;

import java.util.Comparator;

/**
 *
 * @author caemci
 */

public class Alumno {
    // Los campos estaticos permiten devolver un único comparador para todas las instancias
    public static final Comparator<Alumno> COMPARATOR_NOMBRE = new ComparatorNombre();
    public static final Comparator<Alumno> COMPARATOR_APELLIDO = new ComparatorApellido();
    public static final Comparator<Alumno> COMPARATOR_NOTA = new ComparatorNota();
    private String nombre;
    private String apellido;
    private int nota;

    public Alumno(String nombre, String apellido, int nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " Nota: " + nota;
    }
    
    // Clase interna que implementa la interface 'Comparator<T>' que ordena por 'nombre'
    static class ComparatorNombre implements Comparator<Alumno> {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o1.nombre.compareTo(o2.nombre); // Los Strings son comparables
        }
    }
    
    // Clase interna que implementa la interface 'Comparator<T>' que ordena por 'apellido'
    static class ComparatorApellido implements Comparator<Alumno> {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o1.apellido.compareTo(o2.apellido); // Los Strings son comparables
        }
    }
    
    // Clase interna que implementa la interface 'Comparator<T>' que ordena por 'nota'
    static class ComparatorNota implements Comparator<Alumno> {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o1.nota - o2.nota; 
        }
    }
}
