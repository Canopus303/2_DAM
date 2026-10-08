public class Moto extends Vehiculo{

    /**
     * Moto (hijo): cilindrada, tieneSidecar.
     */
    private int cilindrada;
    private  boolean tieneSidecar;

    //constructor
    public Moto(){
        super();
        this.cilindrada = 0;
        this.tieneSidecar = false;
    }
    public Moto(String marca, String modelo, double precioBase, int anio, int cilindrada, boolean tieneSidecar){
        super(marca,modelo,precioBase,anio);
        this.cilindrada = cilindrada;
        this.tieneSidecar = tieneSidecar;
    }

    //getset
    public int getCilindrada(){
        return cilindrada;
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
    public boolean getTieneSidecar(){
        return tieneSidecar;
    }
    public void setTieneSidecar(boolean tieneSidecar){
        this.tieneSidecar = tieneSidecar;
    }

    public double precioFinal(){
        if(cilindrada>500 && tieneSidecar == true){
            return super.precioFinal()+300+100;
        } else if (cilindrada>500 && tieneSidecar == false) {
            return super.precioFinal()+300;
        } else if (cilindrada<500 && tieneSidecar == true) {
            return super.precioFinal()+100;
        } else
            return super.precioFinal();
    }
}



