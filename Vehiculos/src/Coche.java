public class Coche extends Vehiculo {

    /**
     * Coche (hijo): numPuertas, esAutomatico.
     */
    private int numPuertas;
    private boolean esAutomatico;

    //contructores
    public Coche(){
        super();
        numPuertas = 1;
        esAutomatico = true;
    }
    public Coche(String marca, String modelo, double precioBase, int anio, int numPuertas, boolean esAutomatico){
        super(marca,modelo,precioBase,anio);
        this.numPuertas = numPuertas;
        this.esAutomatico = esAutomatico;
    }

    //getset
    public int getNumPuertas(){
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas){
        this.numPuertas = numPuertas;
    }
    public boolean getesAutomatico(){
        return esAutomatico;
    }
    public void setEsAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }

    //metodos propios
    public double precioFinal(){
        double precio = super.precioFinal();

        if (numPuertas >= 5) {
            precio += 200;
        }

        if (esAutomatico) {
            precio += 150;
        }

        return precio;
    }

}
