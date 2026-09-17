package matrices;

public class EsquinasMatriz {

    public static void imprimirEsquinas(int[][] matriz) {
        int ultimaFila = matriz.length - 1;
        int ultimaColumna = matriz[0].length - 1;

        System.out.println("Esquina superior izquierda: " + matriz[0][0]);
        System.out.println("Esquina superior derecha: " + matriz[0][ultimaColumna]);
        System.out.println("Esquina inferior izquierda: " + matriz[ultimaFila][0]);
        System.out.println("Esquina inferior derecha: " + matriz[ultimaFila][ultimaColumna]);
    }
}