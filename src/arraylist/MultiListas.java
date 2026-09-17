package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import arreglos.GeneradorNumeros;

public class MultiListas {

    private static final int cantidadDeNumeros = 20;
    private static final int valorMinimo = 1;
    private static final int valorMaximo = 100;

    public static void main(String[] args) {
        ArrayList<Integer> numeros = generarListaAleatoria(cantidadDeNumeros, valorMinimo, valorMaximo);
        imprimirLista(numeros, "Lista original:");

        ArrayList<Integer> ordenadaAscendente = new ArrayList<>(numeros);
        Collections.sort(ordenadaAscendente);
        imprimirLista(ordenadaAscendente, "Lista ordenada ascendente:");

        ArrayList<Integer> ordenadaDescendente = new ArrayList<>(numeros);
        Collections.sort(ordenadaDescendente, Collections.reverseOrder());
        imprimirLista(ordenadaDescendente, "Lista ordenada descendente:");

        ArrayList<Integer> pares = filtrarPares(numeros);
        ArrayList<Integer> impares = filtrarImpares(numeros);
        imprimirLista(pares, "Números pares:");
        imprimirLista(impares, "Números impares:");
    }

    private static ArrayList<Integer> generarListaAleatoria(int cantidad, int minimo, int maximo) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int posicion = 0; posicion < cantidad; posicion++) {
            numeros.add(GeneradorNumeros.generarNumeroEnRango(minimo, maximo));
        }

        return numeros;
    }

    private static ArrayList<Integer> filtrarPares(ArrayList<Integer> numeros) {
        ArrayList<Integer> pares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }

        return pares;
    }

    private static ArrayList<Integer> filtrarImpares(ArrayList<Integer> numeros) {
        ArrayList<Integer> impares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 != 0) {
                impares.add(numero);
            }
        }

        return impares;
    }

    private static void imprimirLista(ArrayList<Integer> numeros, String mensaje) {
        System.out.println(mensaje);
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}