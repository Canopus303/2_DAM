import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class leerArchivo {

    static void leerBinario(String ruta) {
        try (DataInputStream dis = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(ruta)))) {

            while (dis.available() > 0) {
                System.out.print(dis.readInt() + " ");
            }
            System.out.println();

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
