package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ParesAscendentemente {

    private static final int cantidadDePares = 20;
    private static final Scanner lectorDeTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numerosPares = generarPrimerosPares(cantidadDePares);
        imprimirLista(numerosPares, "ArrayList inicial:");

        int numeroAInsertar = leerNumeroDelUsuario("Ingrese un número para insertar: ");
        insertarEnPosicionOrdenada(numerosPares, numeroAInsertar);
        imprimirLista(numerosPares, "ArrayList después de insertar:");

        int numeroABorrar = leerNumeroDelUsuario("Ingrese un número para borrar: ");
        numerosPares.remove(Integer.valueOf(numeroABorrar));
        imprimirLista(numerosPares, "ArrayList después de borrar:");
    }

    private static ArrayList<Integer> generarPrimerosPares(int cantidad) {
        ArrayList<Integer> pares = new ArrayList<>();
        int numeroPar = 0;

        for (int posicion = 0; posicion < cantidad; posicion++) {
            pares.add(numeroPar);
            numeroPar += 2;
        }

        return pares;
    }

    private static void insertarEnPosicionOrdenada(ArrayList<Integer> numeros, int numeroAInsertar) {
        int posicion = 0;

        while (posicion < numeros.size() && numeros.get(posicion) < numeroAInsertar) {
            posicion++;
        }

        numeros.add(posicion, numeroAInsertar);
    }

    private static int leerNumeroDelUsuario(String mensaje) {
        System.out.print(mensaje);
        return lectorDeTeclado.nextInt();
    }

    private static void imprimirLista(ArrayList<Integer> numeros, String mensaje) {
        System.out.println(mensaje);
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}