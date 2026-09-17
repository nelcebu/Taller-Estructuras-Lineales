package matrices;

public class SimetricaEsquinas {

    private static final int tamanoMatriz = 3;
    private static final int valorMinimo = 0;
    private static final int valorMaximo = 20;

    public static void main(String[] args) {
        int[][] matriz = MatrizAleatoria.generarMatrizAleatoria(tamanoMatriz, tamanoMatriz, valorMinimo, valorMaximo);
        imprimirMatriz(matriz);

        if (MatrizSimetrica.esSimetrica(matriz)) {
            System.out.println("La matriz ES simétrica");
        } else {
            System.out.println("La matriz NO es simétrica");
        }

        EsquinasMatriz.imprimirEsquinas(matriz);
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