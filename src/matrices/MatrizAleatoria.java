package matrices;

import arreglos.GeneradorNumeros;

public class MatrizAleatoria {

    public static int[][] generarMatrizAleatoria(int filas, int columnas, int minimo, int maximo) {
        int[][] matriz = new int[filas][columnas];

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                matriz[fila][columna] = GeneradorNumeros.generarNumeroEnRango(minimo, maximo);
            }
        }

        return matriz;
    }
}