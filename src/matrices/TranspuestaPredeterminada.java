package matrices;

public class TranspuestaPredeterminada {

    public static void main(String[] args) {
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrizTranspuesta = TranspuestaMatriz.calcular(matrizOriginal);

        System.out.println("Matriz original:");
        imprimirMatriz(matrizOriginal);

        System.out.println("Matriz transpuesta:");
        imprimirMatriz(matrizTranspuesta);
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