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
public class Main {

    public static void main(String[] args) {
        Circulo uno = new Circulo(2.0, "blanco");
        Circulo dos = new Circulo(3.0);
        Circulo tres = new Circulo(4.0);

        System.out.println("Area del primero: "+uno.calcularArea()+" "+uno.devolverColor());
        System.out.println("Area del segundo: "+dos.calcularArea());
        System.out.println("Area del tercero: "+tres.calcularArea());
        System.out.println("Perimetro del primero: "+uno.calcularPerimetro());
        System.out.println("Perimetro del segundo: "+dos.calcularPerimetro());
        System.out.println("Perimetro del tercero: "+tres.calcularPerimetro());

    }

}