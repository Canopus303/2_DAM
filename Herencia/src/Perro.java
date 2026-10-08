public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, int edad, String raza){
        super(nombre,edad);
        this.raza = raza;
    }
    public Perro(){
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
        return "guau"+ resultadoPadre;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.printf(raza);
    }
    public double calcularCostoMantenimiento(){
        return 20.0;
    }

}
