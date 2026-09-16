package arraylist;

import java.util.ArrayList;
import arreglos.GeneradorNumeros;

public class SumaMediaAleatorios {

    private static final int valorMinimo = -10;
    private static final int valorMaximo = 10;
    private static final int numeroDeParada = 10;

    public static void main(String[] args) {
        ArrayList<Integer> numerosLeidos = leerNumerosHastaEncontrar(numeroDeParada);

        imprimirNumeros(numerosLeidos);
        System.out.println("Suma: " + calcularSuma(numerosLeidos));
        System.out.println("Media: " + calcularMedia(numerosLeidos));
    }

    private static ArrayList<Integer> leerNumerosHastaEncontrar(int numeroDeParada) {
        ArrayList<Integer> numeros = new ArrayList<>();
        int numeroLeido;

        do {
            numeroLeido = GeneradorNumeros.generarNumeroEnRango(valorMinimo, valorMaximo);
            if (numeroLeido != numeroDeParada) {
                numeros.add(numeroLeido);
            }
        } while (numeroLeido != numeroDeParada);

        return numeros;
    }

    private static int calcularSuma(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    private static double calcularMedia(ArrayList<Integer> numeros) {
        return (double) calcularSuma(numeros) / numeros.size();
    }

    private static void imprimirNumeros(ArrayList<Integer> numeros) {
        System.out.println("Números leídos:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}