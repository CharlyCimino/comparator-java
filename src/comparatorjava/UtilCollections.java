package comparatorjava;

import java.util.Collection;

/**
 *
 * @author caemci
 * @see https://github.com/caemci
 */
public class UtilCollections {
    public static void mostrarColeccion(Collection<?> col) {
        for (Object object : col) {
            System.out.println(object);
        }
    }
}
