public class Vendedor extends Empleado{

    /**
     * Vendedor (hijo): ventasMes, comision (% sobre ventas).
     */

    private int ventasMes;
    private double comision;

    public Vendedor(){
        super();
        this.ventasMes = 0;
        this.comision = 0.0;
    }
    public Vendedor(String nombre, double salarioBase, int antiguedad, int ventasMes, double comision){
        super(nombre, salarioBase, antiguedad);
        this.ventasMes = ventasMes;
        this.comision = comision;
    }

    public int getVentasMes() {
        return ventasMes;
    }
    public void setVentasMes(int ventasMes) {
        this.ventasMes = ventasMes;
    }
    public double getComision() {
        return comision;
    }
    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public double salarioFinal() {
        return super.salarioFinal() + (this.ventasMes * this.comision / 100);
    }
}
