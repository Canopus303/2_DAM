public class Revista extends Publicacion {
    /**
     * Revista (hijo): numero, periodicidad (semanal/mensual).
     */

    private int numero;
    private String periodicidad;

    //constructores
    public Revista(){
        super();
        numero = 0;
        periodicidad = "semanal";
    }
    public Revista(String titulo, double precio, int numPaginas, int numero, String periodicidad){
        super(titulo,precio,numPaginas);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    //getset
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getPeriodicidad() {
        return periodicidad;
    }
    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    //metodo

    @Override
    public double precioFinal() {
        if(periodicidad.equals("semanal")){
            return super.precioFinal() + 3;
        }else return super.precioFinal();
    }
}
