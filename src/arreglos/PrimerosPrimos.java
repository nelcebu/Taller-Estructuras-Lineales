package arreglos;

public class PrimerosPrimos {

    public static void main(String[] args) {
        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        imprimirArreglo(primos);
    }

    private static void imprimirArreglo(int[] arreglo) {
        System.out.println("Los primeros 10 números primos son:");
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}