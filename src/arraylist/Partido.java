package arraylist;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Partido {

    private static final String rutaArchivo = "src/arraylist/PartidoLiga (1).txt";
    private static final String equipoAContar = "Barcelona";

    public static void main(String[] args) throws Exception {

        System.out.println("Crear el arraylist como manejador del txt");
        ArrayList<PartidosFutbol> partidos = new ArrayList<>();
        File fichero = new File(rutaArchivo);
        Scanner leer;

        try {
            System.out.println("Leer el documento");
            leer = new Scanner(fichero);
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                String[] cortarString = linea.split("::");
                PartidosFutbol partido = new PartidosFutbol();
                partido.setEquipoLocal(cortarString[0]);
                partido.setEquipoVisitante(cortarString[1]);
                partido.setGolLocal(Integer.parseInt(cortarString[2]));
                partido.setGolVisitante(Integer.parseInt(cortarString[3]));

                partidos.add(partido);
            }
            leer.close();
        } catch (Exception e) {
            System.out.println("Fichero no se puede leer: " + e.getMessage());
        }

        System.out.println("Cantidad de partidos leídos: " + partidos.size());

        System.out.println("\nPartidos donde ganó el visitante:");
        for (PartidosFutbol partido : partidos) {
            if (partido.getGolVisitante() > partido.getGolLocal()) {
                System.out.println(partido.getEquipoLocal() + " " + partido.getGolLocal()
                        + " - " + partido.getGolVisitante() + " " + partido.getEquipoVisitante());
            }
        }

        int victoriasBarcelona = 0;
        for (PartidosFutbol partido : partidos) {
            boolean jugoComoLocal = partido.getEquipoLocal().equals(equipoAContar);
            boolean jugoComoVisitante = partido.getEquipoVisitante().equals(equipoAContar);

            if (jugoComoLocal && partido.getGolLocal() > partido.getGolVisitante()) {
                victoriasBarcelona++;
            } else if (jugoComoVisitante && partido.getGolVisitante() > partido.getGolLocal()) {
                victoriasBarcelona++;
            }
        }

        System.out.println("\nEl " + equipoAContar + " ganó " + victoriasBarcelona + " partidos");

        for (int posicion = partidos.size() - 1; posicion >= 0; posicion--) {
            PartidosFutbol partido = partidos.get(posicion);
            if (partido.getGolLocal() != partido.getGolVisitante()) {
                partidos.remove(posicion);
            }
        }

        System.out.println("\nPartidos restantes (solo empates): " + partidos.size());

        int victoriasLocales = 0;
        for (PartidosFutbol partido : partidos) {
            if (partido.getGolLocal() > partido.getGolVisitante()) {
                victoriasLocales++;
            }
        }

        System.out.println("Cantidad de partidos ganados por el equipo local: " + victoriasLocales);
    }
}