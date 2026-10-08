public class Animal {

    private String nombre;
    private int edad;

    //Constructor por defecto que asigna valores por defecto
    public Animal(){
        this.nombre="animal";
        this.edad=1;
    }
    public Animal(String n, int e){
        this.nombre = n;
        this.edad = e;
    }

    //Tengo que meter los get/set para poder modificar valores
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    public String hacerSonido(){
        return "...";
    }

    public void mostrarInfo(){
        System.out.println(this.nombre+" "+this.edad);
    }

    public double calcularCostoMantenimiento(){
        return 10.0;
    }

}
