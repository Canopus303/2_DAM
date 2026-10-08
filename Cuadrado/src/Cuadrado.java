public class Cuadrado {

    protected int lado;
    protected String color;
    //Constructor de cuadrado recibiendo un entero
    //Los carga de arriba a abajo y los ejecuta/comprueba de abajo arriba Como con la pila de magic
    public Cuadrado(){
        this.lado = 1;
    }
    public Cuadrado(int l){
        this.lado = l;
        this.color = "Negro";
    }
    public Cuadrado(int l, String c){
        this.lado = l;
        this.color = c;
    }

    public int calcularArea(){
        return lado*lado;
    }
    public int calcularVolumen(){
        return lado*lado*lado;
    }
    public String mostrarColor(){
        return color;
    }
}
