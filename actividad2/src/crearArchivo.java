import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class crearArchivo {

    /**
     * Crea un archivo binario usando DataOutputStream + BufferedOutputStream + FileOutputStream
     */
        public static void escribir(int[] numeros, String ruta) {
            try (FileOutputStream fos = new FileOutputStream(ruta);
                 BufferedOutputStream bos = new BufferedOutputStream(fos);
                 DataOutputStream dos = new DataOutputStream(bos)) {

                for (int numero : numeros) {
                    dos.writeInt(numero);
                }
                System.out.println("Archivo binario '" + ruta + "' creado.");

            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }



}
