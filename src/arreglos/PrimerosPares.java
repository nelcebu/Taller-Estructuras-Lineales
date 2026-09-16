package arreglos;

public class PrimerosPares {

    private static final int cantidadNumerosPares = 100;
    private static final int cantidadLineasImpresion = 10;

    public static void main(String[] args) {
        int[] numerosPares = generarNumerosPares(cantidadNumerosPares);
        imprimirEnUnaLinea(numerosPares);
        imprimirEnVariasLineas(numerosPares, cantidadLineasImpresion);
    }

    private static int[] generarNumerosPares(int cantidadDeNumeros) {
        int[] numerosPares = new int[cantidadDeNumeros];
        int numeroParActual = 0;

        for (int posicion = 0; posicion < cantidadDeNumeros; posicion++) {
            numerosPares[posicion] = numeroParActual;
            numeroParActual += 2;
        }

        return numerosPares;
    }

    private static void imprimirEnUnaLinea(int[] numerosPares) {
        System.out.println("Los " + numerosPares.length + " primeros números pares en una sola línea:");
        for (int numeroPar : numerosPares) {
            System.out.print(numeroPar + " ");
        }
        System.out.println();
    }

    private static void imprimirEnVariasLineas(int[] numerosPares, int cantidadDeLineas) {
        System.out.println("Los " + numerosPares.length + " primeros números pares en " + cantidadDeLineas + " líneas:");
        int numerosPorLinea = numerosPares.length / cantidadDeLineas;

        for (int numeroDeLinea = 0; numeroDeLinea < cantidadDeLineas; numeroDeLinea++) {
            System.out.print("Línea " + (numeroDeLinea + 1) + ": ");

            for (int posicionEnLinea = 0; posicionEnLinea < numerosPorLinea; posicionEnLinea++) {
                int posicionEnArreglo = numeroDeLinea * numerosPorLinea + posicionEnLinea;
                System.out.print(numerosPares[posicionEnArreglo] + " ");
            }
            System.out.println();
        }
    }
}