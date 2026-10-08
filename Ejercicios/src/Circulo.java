/**
 * Ejercicio 1.1 — Clase simple con constantes
 * Objetivo: practicar constantes y constructores.
 *
 * Crea una clase Circulo con:
 *
 * Constante PI = 3.1416 (usa static final).
 *
 * Atributo radio (double).
 *
 * Un constructor que reciba el radio.
 *
 * Un método calcularArea() que devuelva PI * radio * radio.
 *
 * Un método calcularPerimetro() que devuelva 2 * PI * radio.
 *
 * En el main, crea tres círculos con radios distintos y muestra sus áreas.
 *
 * <details> <summary>💡 Pista</summary>
 * Recuerda que las constantes se declaran static final y por convención van en MAYÚSCULAS.
 *
 * </details>
 */
/**
 * Ejercicio 1.1 — Clase simple con constantes
 * Objetivo: practicar constantes y constructores.
 *
 * Crea una clase Circulo con:
 *
 * Constante PI = 3.1416 (usa static final).
 *
 * Atributo radio (double).
 *
 * Un constructor que reciba el radio.
 *
 * Un método calcularArea() que devuelva PI * radio * radio.
 *
 * Un método calcularPerimetro() que devuelva 2 * PI * radio.
 *
 * En el main, crea tres círculos con radios distintos y muestra sus áreas.
 *
 * <details> <summary>💡 Pista</summary>
 * Recuerda que las constantes se declaran static final y por convención van en MAYÚSCULAS.
 *
 * </details>
 */
class Circulo{

    //Constantes = Static final (estáticas e inamovibles y finales pq no se pueden modificar
    static final double pi = 3.1416;
    double radio;
    String color;
    //Contructor que reciba un radio
    public Circulo(){
        this(1.0);
    }
    public Circulo(double r){
        this(r, "blanco");
    }
    public Circulo(double r, String c){
        this.comprobarRadio(r);
        this.color = c;
    }
    //metodo calcularArea() que devuelva pi * radio * radio
    public double calcularArea(){
        return pi*this.radio*this.radio;
    }

    //metodo calcularPerimetro() que devuelva 2*pi*radio
    public double calcularPerimetro(){
        return 2*pi*this.radio;
    }
    //metodo devolverColor
    public String devolverColor(){
        return color;
    }
    /**
     * Ejercicio 1.2 — Validación en constructor
     * Objetivo: practicar validación con métodos privados.
     *
     * Modifica Circulo para que:
     *
     * Si el radio es negativo, se asigne 1.0 por defecto.
     *
     * Crea un método private void comprobarRadio(double radio) que haga la validación.
     *
     * Llama a ese método desde el constructor.
     *
     * <details> <summary>💡 Pista</summary>
     * El método comprobarRadio debe ser private y void. Dentro del constructor, en lugar de this.radio = radio; harás comprobarRadio(radio);.
     *
     * </details>
     */
    private void comprobarRadio(double radio){

        if(radio < 0){
            this.radio = 1.0;
        }
        else{
            this.radio = radio;
        }
    }





}