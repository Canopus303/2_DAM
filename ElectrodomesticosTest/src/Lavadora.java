/**
 * Clase que representa una lavadora, que es un electrodoméstico.
 * Añade el atributo carga.
 *
 * @author Evaluación Inicial
 * @version 1.0
 */
public class Lavadora extends Electrodomestico {

    /** Carga por defecto. */
    private static final double CARGA_DEFECTO = 5.0;

    /** Carga de la lavadora en kg. */
    private double carga;

    /**
     * Constructor por defecto.
     */
    public Lavadora() {
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO);
    }

    /**
     * Constructor con precio y peso. El resto por defecto.
     *
     * @param precioBase Precio base.
     * @param peso       Peso en kg.
     */
    public Lavadora(double precioBase, double peso) {
        this(precioBase, peso, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO, CARGA_DEFECTO);
    }

    /**
     * Constructor con todos los atributos.
     *
     * @param precioBase       Precio base.
     * @param peso             Peso en kg.
     * @param consumoEnergetico Consumo energético (A-F).
     * @param color            Color.
     * @param carga            Carga en kg.
     */
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, double carga) {
        super(precioBase, peso, consumoEnergetico, color);
        this.carga = carga;
    }

    /** @return Carga de la lavadora. */
    public double getCarga() { return carga; }

    /**
     * Calcula el precio final de la lavadora.
     * Si la carga es mayor de 30 kg, aumenta 50 €.
     *
     * @return Precio final.
     */
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (this.carga > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }
}