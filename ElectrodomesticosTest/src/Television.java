/**
 * Clase que representa un televisor, que es un electrodoméstico.
 * Añade los atributos resolución y SmartTV.
 *
 * @author Evaluación Inicial
 * @version 1.0
 */
public class Television extends Electrodomestico {

    /** Resolución por defecto. */
    private static final double RESOLUCION_DEFECTO = 20.0;

    /** SmartTV por defecto. */
    private static final boolean SMARTTV_DEFECTO = true;

    /** Resolución en pulgadas. */
    private double resolucion;

    /** Indica si es SmartTV. */
    private boolean smartTV;

    /**
     * Constructor por defecto.
     */
    public Television() {
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO);
    }

    /**
     * Constructor con precio y peso. El resto por defecto.
     *
     * @param precioBase Precio base.
     * @param peso       Peso en kg.
     */
    public Television(double precioBase, double peso) {
        this(precioBase, peso, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO, RESOLUCION_DEFECTO, SMARTTV_DEFECTO);
    }

    /**
     * Constructor con todos los atributos.
     *
     * @param precioBase       Precio base.
     * @param peso             Peso en kg.
     * @param consumoEnergetico Consumo energético (A-F).
     * @param color            Color.
     * @param resolucion       Resolución en pulgadas.
     * @param smartTV          Indica si es SmartTV.
     */
    public Television(double precioBase, double peso, char consumoEnergetico, String color, double resolucion, boolean smartTV) {
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion = resolucion;
        this.smartTV = smartTV;
    }

    /** @return Resolución en pulgadas. */
    public double getResolucion() { return resolucion; }

    /** @return true si es SmartTV. */
    public boolean isSmartTV() { return smartTV; }

    /**
     * Calcula el precio final del televisor.
     * Si la resolución es mayor de 40 pulgadas, aumenta un 30%.
     * Si es SmartTV, aumenta 50 €.
     *
     * @return Precio final.
     */
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (this.resolucion > 40) {
            precioFinal += precioFinal * 0.30;
        }
        if (this.smartTV) {
            precioFinal += 50;
        }
        return precioFinal;
    }
}