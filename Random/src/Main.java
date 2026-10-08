import java.util.Random;
import java.io.RandomAccessFile;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[20];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(21) + 20; // 20 a 40
        }

        try (RandomAccessFile fil = new RandomAccessFile("numeros.txt", "rw")) {

            //Escribe los numeros
            for (int i = 0; i < numeros.length; i++) {
                fil.writeInt(numeros[i]);
            }

            //Vuelve al inicio y lee, se podria hacer una clase leer a parte
            fil.seek(0);
            for (int i = 0; i < numeros.length; i++) {
                int leido = fil.readInt();
                System.out.print(" "+leido);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}