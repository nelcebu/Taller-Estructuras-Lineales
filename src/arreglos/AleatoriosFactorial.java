package arreglos;

public class AleatoriosFactorial {

    private static final int cantidadDeNumeros = 10;
    private static final int valorMinimo = 1;
    private static final int valorMaximo = 12;

    public static void main(String[] args) {
        int[] numerosLeidos = GeneradorNumeros.generarNumerosAleatorios(cantidadDeNumeros, valorMinimo, valorMaximo);
        int[] factoriales = calcularFactoriales(numerosLeidos);

        imprimirArreglo(numerosLeidos, "Números aleatorios leídos:");
        imprimirArreglo(factoriales, "Factoriales resultantes:");
    }

    private static int[] calcularFactoriales(int[] numeros) {
        int[] factoriales = new int[numeros.length];

        for (int posicion = 0; posicion < numeros.length; posicion++) {
            factoriales[posicion] = calcularFactorialDeUnNumero(numeros[posicion]);
        }

        return factoriales;
    }

    private static int calcularFactorialDeUnNumero(int numero) {
        int resultado = 1;
        for (int factor = 2; factor <= numero; factor++) {
            resultado *= factor;
        }
        return resultado;
    }

    private static void imprimirArreglo(int[] arreglo, String mensaje) {
        System.out.println(mensaje);
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}