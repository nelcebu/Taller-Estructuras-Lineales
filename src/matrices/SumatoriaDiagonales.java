package matrices;

public class SumatoriaDiagonales {

    private static final int tamanoMatriz = 3;
    private static final int valorMinimo = -50;
    private static final int valorMaximo = 50;

    public static void main(String[] args) {
        int[][] matriz = MatrizAleatoria.generarMatrizAleatoria(tamanoMatriz, tamanoMatriz, valorMinimo, valorMaximo);
        imprimirMatriz(matriz);

        int suma = DiagonalOpuesta.calcularSuma(matriz);
        System.out.println("Suma de la diagonal opuesta: " + suma);
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