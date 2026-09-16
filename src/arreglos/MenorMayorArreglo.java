package arreglos;

public class MenorMayorArreglo {

    private static final int cantidadDeNumeros = 25;
    private static final int valorMinimo = -50;
    private static final int valorMaximo = 50;

    public static void main(String[] args) {
        int[] numeros = GeneradorNumeros.generarNumerosAleatorios(cantidadDeNumeros, valorMinimo, valorMaximo);

        imprimirArreglo(numeros, "Números generados:");
        System.out.println("El número menor es: " + buscarNumeroMenor(numeros));
        System.out.println("El número mayor es: " + buscarNumeroMayor(numeros));
    }

    private static int buscarNumeroMenor(int[] numeros) {
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }

    private static int buscarNumeroMayor(int[] numeros) {
        int mayor = numeros[0];

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }

        return mayor;
    }

    private static void imprimirArreglo(int[] arreglo, String mensaje) {
        System.out.println(mensaje);
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}