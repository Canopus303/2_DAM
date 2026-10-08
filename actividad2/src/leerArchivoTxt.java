import java.io.*;

public class leerArchivoTxt {

        static void leerTexto(String ruta) {
            try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.print(linea + " ");
                }
                System.out.println();
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
}

