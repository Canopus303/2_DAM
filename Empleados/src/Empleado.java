public class Empleado {
    /**
     * Empleado (padre): nombre, salarioBase, antiguedad (años).
     */
    //parametros
    private String nombre;
    private double salarioBase;
    private int antiguedad;

    //constructores
    public Empleado(){
        this.nombre = " ";
        this.salarioBase = 0.0;
        this.antiguedad = 0;
    }
    public Empleado(String nombre, double salarioBase, int antiguedad){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.antiguedad = antiguedad;
    }

    //getset

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double salarioFinal(){
        return this.salarioBase + (this.antiguedad * 50);
    }

}
