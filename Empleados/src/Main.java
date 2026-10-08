//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Ejercicio 4.2 — Sistema de empleados
         * Objetivo: practicar herencia con más niveles.
         *
         * Crea:
         *
         * Empleado (padre): nombre, salarioBase, antiguedad (años).
         *
         * Gerente (hijo): departamento, bonus.
         *
         * Vendedor (hijo): ventasMes, comision (% sobre ventas).
         *
         * Reglas de salario:
         *
         * Empleado.salarioFinal(): salarioBase + (antiguedad * 50).
         *
         * Gerente.salarioFinal(): padre + bonus.
         *
         * Vendedor.salarioFinal(): padre + (ventasMes * comision / 100).
         *
         * Main: vector de 10 empleados, totales por tipo.
         */
        int gerentes = 0;
        int vendedores = 0;
        Empleado[] empleados = new Empleado[10];
        empleados[0] = new Gerente("Carlos", 2800, 8, "Informática", 600);
        empleados[1] = new Gerente("Laura", 3200, 5, "Recursos Humanos", 800);
        empleados[2] = new Gerente("Miguel", 2500, 12, "Ventas", 1000);
        empleados[3] = new Gerente("Ana", 3500, 3, "Marketing", 500);
        empleados[4] = new Gerente("David", 3000, 10, "Producción", 750);

        empleados[5] = new Vendedor("Javier", 1600, 4, 12000, 5);
        empleados[6] = new Vendedor("Marta", 1800, 6, 18000, 4);
        empleados[7] = new Vendedor("Pablo", 1500, 2, 9500, 6);
        empleados[8] = new Vendedor("Sara", 1700, 7, 22000, 3.5);
        empleados[9] = new Vendedor("Alberto", 1900, 9, 25000, 4.5);

        for(int i = 0; i< empleados.length;i++){
            if(empleados[i] instanceof Gerente){
                gerentes++;
            }else vendedores++;
        }
        System.out.println("Num gerentes: "+gerentes);
        System.out.println(("Num vendedores: "+ vendedores));
        
    }
}