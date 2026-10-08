public class Vehiculo {
    /**
     * Vehiculo (padre): marca, modelo, precioBase, anio.
     */
    private String marca;
    private String modelo;
    private double precioBase;
    private int anio;

    //contructor con valores default de 0 o vacio
    public Vehiculo(){
        this.marca = " ";
        this.modelo = " ";
        this.precioBase = 0.0;
        this.anio = 0;
    }
    //constructor con datos
    public Vehiculo(String marca, String modelo, double precioBase, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.anio = anio;
    }

    //metodos set/get

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public double getPrecioBase(){
        return precioBase;
    }
    public void setPrecioBase(double precioBase){
        this.precioBase = precioBase;
    }
    public int getAnio(){
        return anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }

    //metodos propios de vehiculo

    public double precioFinal(){
        if(anio<2010){
            return precioBase+100.0;
        }
        else return precioBase;
    }
}
