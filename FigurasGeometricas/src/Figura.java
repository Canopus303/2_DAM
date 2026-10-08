public class Figura {

    /**
     * Atributos: nombre (String), precioBase (double), color (String).
     *
     * Por defecto: precioBase = 10.0, color = "blanco".
     *
     * Constructores: por defecto, con precio, con todos.
     *
     * Método precioFinal(): devuelve precioBase.
     *
     * Getters de todos los atributos.
     */

    private String nombre;
    private double precioBase;
    private String color;

    public Figura(){
        nombre = " ";
        precioBase = 10.0;
        color = "blanco";
    }
    public Figura(String nombre, double precioBase, String color){
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double precioFinal(){
        return precioBase;
    }
}
