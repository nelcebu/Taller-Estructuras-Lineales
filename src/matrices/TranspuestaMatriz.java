package matrices;

public class TranspuestaMatriz {

    public static int[][] calcular(int[][] matriz) {
        int filasOriginal = matriz.length;
        int columnasOriginal = matriz[0].length;
        int[][] transpuesta = new int[columnasOriginal][filasOriginal];

        for (int fila = 0; fila < filasOriginal; fila++) {
            for (int columna = 0; columna < columnasOriginal; columna++) {
                transpuesta[columna][fila] = matriz[fila][columna];
            }
        }

        return transpuesta;
    }
}