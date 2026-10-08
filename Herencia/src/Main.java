//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Asi se hacen vectores de una clase para meter varios objetos en el
        Animal[] animales = new Animal[5];
        int perros=0;
        int gatos=0;
        int ani=0;
        double coste=0.0;
        animales[0] = new Perro("Coco",2,"Labrador");
        animales[1] = new Perro("Calcetines",4,"Chucho");
        animales[2] = new Gato("Firu",10,"Naranja");
        animales[3] = new Gato("bob",4,"Siames");
        animales[4] = new Animal();

        for (int i=0;i<animales.length;i++) {
            System.out.println(animales[i].hacerSonido());
        }
        //uso de instanceof quiere decir cuantas instancias de un objeto hay
        for (int i = 0; i < animales.length; i++) {

            if (animales[i] instanceof Perro) {
                perros++;
                coste += animales[i].calcularCostoMantenimiento();

            } else if (animales[i] instanceof Gato) {
                gatos++;
                coste += animales[i].calcularCostoMantenimiento();

            } else {
                ani++;
                coste += animales[i].calcularCostoMantenimiento();
            }
        }
        System.out.println("Perros: "+perros);
        System.out.println("Gatos: "+gatos);
        System.out.println("Animales Genericos: "+ani);
        System.out.println("Coste total: "+coste);




    }
}