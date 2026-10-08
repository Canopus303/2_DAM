/**
 * Escribe un programa que genere 20 números enteros comprendidos entre el 20 y el 40 de forma aleatoria.
 * Posteriormente el programa debe crear los siguientes ficheros de acuerdo a las especificaciones siguientes:
 *
 * numeros.dat usando DataOutputStream + BufferedOutputStream + FileOutputStream, este fichero es binario.
 * numeros.txt usando BufferedWriter, este fichero es de texto por lo que debes tratar los números como cadenas.
 */

import java.io.*;
import java.util.Random;

public class GeneradorNumeros {
    public static void main(String[] args) {

        int[] numeros = new int[20];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(21) + 20; // 20 a 40
        }

        crearArchivo.escribir(numeros, "numeros.dat");
        crearArchvoTexto.escribir(numeros, "numeros.txt");
        leerArchivo.leerBinario("numeros.dat");
        leerArchivoTxt.leerTexto("numeros.txt");
        System.out.println();
        String cwd = System.getProperty("user.dir");
        System.out.println("user.dir = " + cwd);

    }


}