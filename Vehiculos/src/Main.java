//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehiculo[] vehiculos = new Vehiculo[8];
        int coches = 0;
        int motos = 0;
        vehiculos[0] = new Coche("Toyota", "Corolla", 18000, 2008, 5, true);
        vehiculos[1] = new Coche("Seat", "Ibiza", 12000, 2015, 3, false);
        vehiculos[2] = new Coche("BMW", "Serie 3", 25000, 2009, 5, false);
        vehiculos[3] = new Coche("Volkswagen", "Golf", 22000, 2020, 5, true);

        vehiculos[4] = new Moto("Honda", "CB500F", 6500, 2012, 500, false);
        vehiculos[5] = new Moto("Yamaha", "MT-07", 7500, 2018, 689, false);
        vehiculos[6] = new Moto("BMW", "R1250GS", 18000, 2007, 1254, true);
        vehiculos[7] = new Moto("Vespa", "Primavera", 4500, 2021, 125, true);

        for (int i = 0; i<vehiculos.length; i++){
            if(vehiculos[i] instanceof Coche){
                coches++;
            } else motos++;
        }
        System.out.println(vehiculos[6].precioFinal());
        System.out.println("Total de coches "+coches);
        System.out.println("Total de motos "+motos);
    }
}