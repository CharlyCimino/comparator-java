
package comparatorjava;

import java.util.Comparator;

/**
 *
 * @author caemci
 * @see https://github.com/caemci
 */
public class Alumno {
    /*
        Los campos estáticos permiten devolver un único comparador de cada tipo para 
        todas las instancias de alumno que hubiere.
    */
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
    
    // Clase interna que implementa la interface 'Comparator<T>' y ordena por 'nombre'
    private static class ComparatorNombre implements Comparator<Alumno> {
        @Override
        public int compare(Alumno alu1, Alumno alu2) {
            /* 
                Como los String implementan la interfaz 'Comparable', puedo compararlos entre sí
                Para entender la interfaz 'Comparable', visita: https://github.com/caemci/comparable-java
            */
            return alu1.nombre.compareTo(alu2.nombre);
        }
    }
    
    // Clase interna que implementa la interface 'Comparator<T>' y ordena por 'apellido'
    private static class ComparatorApellido implements Comparator<Alumno> {
        @Override
        public int compare(Alumno alu1, Alumno alu2) {
            /* 
                Como los String implementan la interfaz 'Comparable', puedo compararlos entre sí
                Para entender la interfaz 'Comparable', visita: https://github.com/caemci/comparable-java
            */
            return alu1.apellido.compareTo(alu2.apellido);
        }
    }
    
    // Clase interna que implementa la interface 'Comparator<T>' y ordena por 'nota'
    private static class ComparatorNota implements Comparator<Alumno> {
        @Override
        public int compare(Alumno alu1, Alumno alu2) {
            return alu1.nota - alu2.nota; 
        }
    }
}
