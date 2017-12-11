package carritopelis;
import javax.swing.JOptionPane;

/*
 * Clase que sirve para pedir y capturar los datos ingresados por el usuario
 *
 * @versión 1.0   Fecha 10/12/2017
 * @author Omar Ulises Hernández Cervantes, Oswaldo Josue Hernández Juárez
 */
public class CapturaDatos {
    /**
     *  PRECIO_MAX es el precio maximo que se puede asignar a una pelicula.
     */
    static final int PRECIO_MAX = 500;
    /**
     *  PRECIO_MAX es el precio minimo que se puede asignar a una pelicula.
     */
    static final int PRECIO_MIN = 10;
    /**
     * Mada un mensaje para ingresar el codigo de barras.
     * @return el cofigo de barras ingresado por el usuario
     * @throws pedirID().
     */
    public final String pedirID() {
        String nombre;
        nombre = JOptionPane.showInputDialog("Escribe el ID de la película:");
        return nombre;
    }
    /**
     * Mada un mensaje para ingresar el titulo de la pelicula.
     * @return el titulo de barras ingresado por el usuario
     * @throws pedirTitulo().
     */
    public final String pedirTitulo() {
        String nombre;
        nombre = JOptionPane.showInputDialog("Escribe el Titulo de la "
                + "película:");

        return nombre;
    }
    /**
     * Mada un mensaje para ingresar el actor de la pelicula.
     * @return el actor ingresado por el usuario
     * @throws pedirActor().
     */
    public final String pedirActor() {
        String nombre;
        nombre = JOptionPane.showInputDialog("Escribe el nombre del Actor "
                + "principal de la película:");
        return nombre;
    }
    /**
     * Mada un mensaje para ingresar el genero de la pelicula.
     * @return el genero ingresado por el usuario
     * @throws pedirGenero().
     */
    public final String pedirGenero() {
        String nombre;
        nombre = JOptionPane.showInputDialog("Escribe el género "
                + "de la película:");
        return nombre;
    }
    /**
     * Mada un mensaje para ingresar el genero de la pelicula.
     * @return el genero ingresado por el usuario
     * @throws pedirGenero().
     */
    public final String pedirPrecio() {
        String precio;
        int x;
        do {
            precio = JOptionPane.showInputDialog("Escribe el precio "
                    + "de la película:");
            x = Integer.parseInt(precio);
            if (x < PRECIO_MIN || x > PRECIO_MAX) {
                JOptionPane.showMessageDialog(null, "Ingresa un precio dentro "
                        + "del rango establecido ($10 - $500)", "Error",
                        JOptionPane.WARNING_MESSAGE);
            }
        } while (x < PRECIO_MIN || x > PRECIO_MAX);
        return precio;
    }
}