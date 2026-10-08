/**
 * Clase que representa un electrodoméstico genérico.
 * Contiene atributos como precio base, color, consumo energético y peso.
 *
 * @author Evaluación Inicial
 * @version 1.0
 */
public class Electrodomestico {

    /** Precio base por defecto. */
    protected static final double PRECIO_BASE_DEFECTO = 100.0;

    /** Color por defecto. */
    protected static final String COLOR_DEFECTO = "blanco";

    /** Consumo energético por defecto. */
    protected static final char CONSUMO_ENERGETICO_DEFECTO = 'F';

    /** Peso por defecto. */
    protected static final double PESO_DEFECTO = 5.0;

    /** Colores disponibles. */
    protected static final String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};

    /** Precio base del electrodoméstico. */
    protected double precioBase;

    /** Color del electrodoméstico. */
    protected String color;

    /** Consumo energético del electrodoméstico (A-F). */
    protected char consumoEnergetico;

    /** Peso del electrodoméstico en kg. */
    protected double peso;

    /**
     * Constructor por defecto.
     * Usa todos los valores por defecto.
     */
    public Electrodomestico() {
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO);
    }

    /**
     * Constructor con precio y peso. El resto por defecto.
     *
     * @param precioBase Precio base del electrodoméstico.
     * @param peso       Peso del electrodoméstico en kg.
     */
    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, peso, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO);
    }

    /**
     * Constructor con todos los atributos.
     *
     * @param precioBase       Precio base del electrodoméstico.
     * @param peso             Peso del electrodoméstico en kg.
     * @param consumoEnergetico Consumo energético (A-F).
     * @param color            Color del electrodoméstico.
     */
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    /**
     * Comprueba que la letra del consumo energético sea correcta (A-F).
     * Si no lo es, asigna la letra por defecto.
     *
     * @param letra Letra a comprobar.
     */
    private void comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
        }
    }

    /**
     * Comprueba que el color sea correcto.
     * Si no lo es, asigna el color por defecto.
     *
     * @param color Color a comprobar.
     */
    private void comprobarColor(String color) {
        boolean encontrado = false;
        for (String c : COLORES_DISPONIBLES) {
            if (c.equalsIgnoreCase(color)) {
                this.color = c;
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            this.color = COLOR_DEFECTO;
        }
    }

    /**
     * Calcula el precio final según el consumo energético y el peso.
     *
     * @return Precio final del electrodoméstico.
     */
    public double precioFinal() {
        double precioFinal = this.precioBase;

        switch (this.consumoEnergetico) {
            case 'A': precioFinal += 100; break;
            case 'B': precioFinal += 80; break;
            case 'C': precioFinal += 60; break;
            case 'D': precioFinal += 50; break;
            case 'E': precioFinal += 30; break;
            case 'F': precioFinal += 10; break;
        }

        if (this.peso >= 0 && this.peso <= 19) {
            precioFinal += 10;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 50;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 80;
        } else if (this.peso >= 80) {
            precioFinal += 100;
        }

        return precioFinal;
    }

    /** @return Precio base. */
    public double getPrecioBase() { return precioBase; }

    /** @return Color. */
    public String getColor() { return color; }

    /** @return Consumo energético. */
    public char getConsumoEnergetico() { return consumoEnergetico; }

    /** @return Peso. */
    public double getPeso() { return peso; }
}