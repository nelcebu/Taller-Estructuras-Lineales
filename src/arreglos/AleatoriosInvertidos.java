package arreglos;

public class AleatoriosInvertidos {

    private static final int cantidadDeNumeros = 20;
    private static final int valorMinimo = -100;
    private static final int valorMaximo = 100;

    public static void main(String[] args) {
        int[] numerosOriginales = GeneradorNumeros.generarNumerosAleatorios(cantidadDeNumeros, valorMinimo, valorMaximo);
        int[] numerosInvertidos = invertirNumeros(numerosOriginales);

        imprimirArreglo(numerosOriginales, "Números originales:");
        imprimirArreglo(numerosInvertidos, "Números invertidos:");
    }

    private static int[] invertirNumeros(int[] numeros) {
        int[] invertidos = new int[numeros.length];

        for (int posicion = 0; posicion < numeros.length; posicion++) {
            invertidos[posicion] = invertirUnNumero(numeros[posicion]);
        }

        return invertidos;
    }

    private static int invertirUnNumero(int numero) {
        boolean esNegativo = numero < 0;
        int numeroPositivo = Math.abs(numero);
        int numeroInvertido = 0;

        while (numeroPositivo > 0) {
            int ultimoDigito = numeroPositivo % 10;
            numeroInvertido = numeroInvertido * 10 + ultimoDigito;
            numeroPositivo = numeroPositivo / 10;
        }

        return esNegativo ? -numeroInvertido : numeroInvertido;
    }

    private static void imprimirArreglo(int[] arreglo, String mensaje) {
        System.out.println(mensaje);
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}