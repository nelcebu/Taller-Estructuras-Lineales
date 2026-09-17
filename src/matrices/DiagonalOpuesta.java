package matrices;

public class DiagonalOpuesta {

    public static int calcularSuma(int[][] matriz) {
        int suma = 0;
        int ultimaColumna = matriz.length - 1;

        for (int fila = 0; fila < matriz.length; fila++) {
            suma += matriz[fila][ultimaColumna - fila];
        }

        return suma;
    }
}