package matrices;

import java.util.Scanner;

public class MatrizIntercambiada {

    private static final int valorMinimo = 0;
    private static final int valorMaximo = 50;
    private static final Scanner lectorDeTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        int cantidadFilas = leerCantidadValida("Ingrese número de filas (mínimo 2): ");
        System.out.print("Ingrese número de columnas: ");
        int cantidadColumnas = lectorDeTeclado.nextInt();

        int[][] matriz = MatrizAleatoria.generarMatrizAleatoria(cantidadFilas, cantidadColumnas, valorMinimo, valorMaximo);

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        IntercambiadorFilas.intercambiarPrimeraYSegunda(matriz);

        System.out.println("Matriz con filas intercambiadas:");
        imprimirMatriz(matriz);
    }

    private static int leerCantidadValida(String mensaje) {
        System.out.print(mensaje);
        int cantidad = lectorDeTeclado.nextInt();

        while (cantidad < 2) {
            System.out.print("Debe ser al menos 2. Intente de nuevo: ");
            cantidad = lectorDeTeclado.nextInt();
        }

        return cantidad;
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