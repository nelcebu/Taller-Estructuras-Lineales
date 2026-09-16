package arreglos;

import java.util.Random;

public class GeneradorNumeros {

    private static final Random generadorAleatorio = new Random();

    public static int[] generarNumerosAleatorios(int cantidad, int minimo, int maximo) {
        int[] numeros = new int[cantidad];

        for (int posicion = 0; posicion < cantidad; posicion++) {
            numeros[posicion] = generarNumeroEnRango(minimo, maximo);
        }

        return numeros;
    }

    public static int generarNumeroEnRango(int minimo, int maximo) {
        return generadorAleatorio.nextInt(maximo - minimo + 1) + minimo;
    }
}