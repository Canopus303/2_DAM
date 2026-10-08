import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class crearArchvoTexto {

    /**
     * Crea un archivo de texto usando BufferedWriter
     */
    public static void escribir(int[] numeros, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {

            for (int i = 0; i < numeros.length; i++) {
                bw.write(String.valueOf(numeros[i]));
                if (i < numeros.length - 1) bw.newLine();
            }
            System.out.println("Archivo de texto '" + ruta + "' creado.");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
