/**
 * Clase ejecutable que prueba las clases Electrodomestico, Lavadora y Television.
 *
 * @author Evaluación Inicial
 * @version 1.0
 */
public class Main {

    /**
     * Método principal.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        // Vector de 10 electrodomésticos
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        // Asignamos objetos con valores variados
        electrodomesticos[0] = new Electrodomestico(200, 30, 'A', "rojo");
        electrodomesticos[1] = new Lavadora(150, 40);
        electrodomesticos[2] = new Television(300, 15, 'B', "negro", 45, true);
        electrodomesticos[3] = new Electrodomestico();
        electrodomesticos[4] = new Lavadora(400, 80, 'C', "gris", 35);
        electrodomesticos[5] = new Television(250, 10);
        electrodomesticos[6] = new Electrodomestico(180, 25, 'D', "azul");
        electrodomesticos[7] = new Lavadora();
        electrodomesticos[8] = new Television(500, 60, 'A', "blanco", 55, false);
        electrodomesticos[9] = new Electrodomestico(120, 5, 'F', "blanco");

        double sumaElectrodomesticos = 0;
        double sumaLavadoras = 0;
        double sumaTelevisiones = 0;

        // Recorremos el vector y ejecutamos precioFinal()
        for (Electrodomestico e : electrodomesticos) {
            double precio = e.precioFinal();

            if (e instanceof Lavadora) {
                sumaLavadoras += precio;
            } else if (e instanceof Television) {
                sumaTelevisiones += precio;
            } else {
                sumaElectrodomesticos += precio;
            }
        }

        // Mostramos resultados
        System.out.println("Suma de Electrodomésticos: " + sumaElectrodomesticos + " €");
        System.out.println("Suma de Lavadoras: " + sumaLavadoras + " €");
        System.out.println("Suma de Televisiones: " + sumaTelevisiones + " €");
        System.out.println("Suma Total: " + (sumaElectrodomesticos + sumaLavadoras + sumaTelevisiones) + " €");
    }
}