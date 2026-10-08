public class Libro extends Publicacion {

    /**
     * Libro (hijo): isbn, anioPublicacion.
     */

    private String isbn;
    private int anioPublicacion;

    //constructores
    public Libro(){
        super();
        isbn = " ";
        anioPublicacion = 0;
    }
    public Libro(String titulo, double precio, int numPaginas, String isbn, int anioPublicacion){
        super(titulo, precio, numPaginas);
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }

    //getset
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    //metodos

    @Override
    public double precioFinal() {
        if(anioPublicacion < 2000){
            return super.precioFinal() + 5;
        } else return super.precioFinal();
    }
}
