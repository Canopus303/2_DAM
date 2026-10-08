public class Gerente extends Empleado {

    /**
     * Gerente (hijo): departamento, bonus.
     */

    private String departamento;
    private double bonus;

    public Gerente(){
        super();
        this.departamento = " ";
        this.bonus = 0.0;
    }
    public Gerente(String nombre, double salarioBase, int antiguedad, String departamento, double bonus){
        super(nombre, salarioBase, antiguedad);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public double salarioFinal() {
        return super.salarioFinal() + this.bonus;
    }
}
