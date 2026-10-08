import java.io.*;

public class LectorExterno {
    public static void main(String[] args) {
        // ⚠️ Ajusta esta ruta a donde estén realmente los archivos
        String rutaDat = "C:\\Users\\pablo\\IdeaProjects\\actividad2";
        String rutaTxt = "C:\\Users\\pablo\\IdeaProjects\\actividad2";

        System.out.println("=== Leyendo " + rutaDat + " ===");
        leerBinario(rutaDat);

        System.out.println("=== Leyendo " + rutaTxt + " ===");
        leerTexto(rutaTxt);
    }

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