package matrices;

public class IntercambiadorFilas {

    public static void intercambiarPrimeraYSegunda(int[][] matriz) {
        int[] filaTemporal = matriz[0];
        matriz[0] = matriz[1];
        matriz[1] = filaTemporal;
    }
}