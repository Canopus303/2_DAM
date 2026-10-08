public class Publicacion {

    /**
     * Publicacion (padre): titulo, precio, numPaginas.
     */
    private String titulo;
    private double precio;
    private int numPaginas;

    //constructores
    public Publicacion(){
        titulo = " ";
        precio = 0.0;
        numPaginas = 0;
    }
    public Publicacion(String titulo, double precio, int numPaginas){
        this.titulo = titulo;
        this.precio = precio;
        this.numPaginas = numPaginas;
    }

    //getset
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    //metodos
    public double precioFinal() {

        if (numPaginas > 500) {
            return precio * 1.20;

        } else if (numPaginas > 200) {
            return precio * 1.10;

        } else {
            return precio;
        }
    }
}
