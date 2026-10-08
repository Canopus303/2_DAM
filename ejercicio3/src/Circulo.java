public class Circulo {
    /**
     *Ejercicio 1.3 — Múltiples constructores con this(...)
     * Objetivo: practicar el encadenamiento de constructores.
     *
     * Añade a Circulo:
     *
     * Un constructor por defecto que llame al constructor con radio 1.0.
     *
     * Un constructor con radio.
     *
     * Un constructor con radio y color (añade el atributo color).
     *
     * Usa this(...) para no duplicar código.
     */
    private double radio;
    private String color;
    public Circulo(){
        this(1.0);
    }
    public Circulo(double r){
        this(r, "blanco");
    }
    public Circulo(double r, String c){
        this.color=c;
        this.radio=r;
    }


}
