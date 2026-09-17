package matrices;

import java.util.Scanner;

public class EnteroEncontrado {

    private static final int cantidadFilas = 3;
    private static final int cantidadColumnas = 3;
    private static final int valorMinimo = 0;
    private static final int valorMaximo = 50;
    private static final Scanner lectorDeTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz = MatrizAleatoria.generarMatrizAleatoria(cantidadFilas, cantidadColumnas, valorMinimo, valorMaximo);
        imprimirMatriz(matriz);

        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscado = lectorDeTeclado.nextInt();

        buscarYMostrarResultado(matriz, numeroBuscado);
    }

    private static void buscarYMostrarResultado(int[][] matriz, int numeroBuscado) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == numeroBuscado) {
                    System.out.println("Encontrado en fila " + (fila+1) + ", columna " + (columna+1));
                    return;
                }
            }
        }
        System.out.println("El número " + numeroBuscado + " no se encuentra en la matriz");
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%-5d", valor);
            }
            System.out.println();
        }
    }
}