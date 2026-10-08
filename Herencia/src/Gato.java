public class Gato extends Animal {

    private String raza;

    public Gato(String nombre, int edad, String raza){
        super(nombre,edad);
        this.raza = raza;
    }
    public Gato(){
        super();
        this.raza = "Chucho";
    }

    //getset

    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }

    public String hacerSonido(){
        String resultadoPadre = super.hacerSonido();
        return "miau"+ resultadoPadre;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.printf(raza);
    }

    public double calcularCostoMantenimiento(){
        return 15.0;
    }

}
