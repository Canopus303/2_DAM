//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Publicacion[] publicacion = new Publicacion[10];

        publicacion[0] = new Libro("El Quijote", 25, 650, "978-8420412146", 1998);
        publicacion[1] = new Libro("1984", 18, 328, "978-0451524935", 1949);
        publicacion[2] = new Libro("Clean Code", 35, 464, "978-0132350884", 2008);
        publicacion[3] = new Libro("Dune", 22, 180, "978-0441172719", 1965);
        publicacion[4] = new Libro("Cien años de soledad", 20, 417, "978-0307474728", 1967);
        publicacion[5] = new Revista("Muy Interesante", 6, 120, 1250, "mensual");
        publicacion[6] = new Revista("National Geographic", 8, 220, 350, "mensual");
        publicacion[7] = new Revista("Computer Hoy", 5, 180, 720, "semanal");
        publicacion[8] = new Revista("Muy Interesante Ciencia", 7, 550, 890, "semanal");
        publicacion[9] = new Revista("Hobby Consolas", 6, 250, 380, "mensual");

        for (int i = 0; i< publicacion.length; i++){
            System.out.println(publicacion[i].precioFinal());
        }

    }
}