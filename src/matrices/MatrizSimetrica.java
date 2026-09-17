package matrices;

public class MatrizSimetrica {

    public static boolean esSimetrica(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                if (matriz[fila][columna] != matriz[columna][fila]) {
                    return false;
                }
            }
        }
        return true;
    }
}