package carritopelis;

/*
 * Clase que contiene la creación del objeto pelicula
 *
 * @versión 1.0   Fecha 10/12/2017
 * @author Omar Ulises Hernández Cervantes, Oswaldo Josue Hernández Juárez
 */
public class Pelicula {
    /**
     *  ID la instancia del codifgo de barrass.
     */
    private final String iD;
    /**
     *  titulo la instancia del ttulo de la pelicula.
     */
    private final String titulo;
    /**
     *  actor la instancia del actor de la pelicula.
     */
    private final String actor;
    /**
     *  titulo la instancia del genero de la pelicula.
     */
    private final String genero;
    /**
     *  precio la instancia del precio de la pelicula.
     */
    private final String precio;
    /**
     *
     * @param iD Cadena que almacena del ID de la película
     * @param titulo Cadena que almacena el nombre de la película
     * @param actor Cadena que almacena el nombre del actor principal de la
     * película
     * @param genero Cadena que almacena el género al que pertenece la película
     * @param precio Cadena que almacena el precio de venta de la película
     */
    public Pelicula(String iD, String titulo, String actor, String genero,
                    String precio) {
        this.iD = iD;
        this.titulo = titulo;
        this.actor = actor;
        this.genero = genero;
        this.precio = precio;
    }
    /**
     * Getter.
     * @return el codigo de barras.
    */
    public final String getID() {
        return iD;
    }
    /**
     * Getter.
     * @return el titulo de la pelicula.
    */
    public final String getTitulo() {
        return titulo;
    }
    /**
     * Getter.
     * @return el actor de la pelicula.
    */
    public final String getActor() {
        return actor;
    }
    /**
     * Getter.
     * @return el genero de la pelicula.
    */
    public final String getGenero() {
        return genero;
    }
    /**
     * Getter.
     * @return el precio de la pelicula.
    */
    public final String getPrecio() {
        return precio;
    }
}
