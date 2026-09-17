package arraylist;

import java.util.ArrayList;
import arreglos.GeneradorNumeros;

public class FrecuenciaAparicion {

    private static final int cantidadDeNumeros = 100;
    private static final int valorMinimo = 1;
    private static final int valorMaximo = 20;

    public static void main(String[] args) {
        ArrayList<Integer> numeros = generarListaAleatoria(cantidadDeNumeros, valorMinimo, valorMaximo);
        int[] frecuencias = contarFrecuencias(numeros, valorMaximo);

        imprimirTablaDeFrecuencias(frecuencias);
        imprimirNumeroMasFrecuente(frecuencias);
    }

    private static ArrayList<Integer> generarListaAleatoria(int cantidad, int minimo, int maximo) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int posicion = 0; posicion < cantidad; posicion++) {
            numeros.add(GeneradorNumeros.generarNumeroEnRango(minimo, maximo));
        }

        return numeros;
    }

    private static int[] contarFrecuencias(ArrayList<Integer> numeros, int valorMaximo) {
        int[] frecuencias = new int[valorMaximo + 1];

        for (int numero : numeros) {
            frecuencias[numero]++;
        }

        return frecuencias;
    }

    private static void imprimirTablaDeFrecuencias(int[] frecuencias) {
        System.out.println("Número | Frecuencia");
        for (int numero = 1; numero < frecuencias.length; numero++) {
            System.out.println("  " + numero + "    |    " + frecuencias[numero]);
        }
    }

    private static void imprimirNumeroMasFrecuente(int[] frecuencias) {
        int numeroMasFrecuente = 1;

        for (int numero = 1; numero < frecuencias.length; numero++) {
            if (frecuencias[numero] > frecuencias[numeroMasFrecuente]) {
                numeroMasFrecuente = numero;
            }
        }

        System.out.println("El número que más se repite es: " + numeroMasFrecuente
                + " (apareció " + frecuencias[numeroMasFrecuente] + " veces)");
    }
}