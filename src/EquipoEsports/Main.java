package EquipoEsports;

public class Main {
    public static void main(String[] args) {

        EquipoEsports equipo1 = new EquipoEsports();

        equipo1.setNombre("Heretics");
        equipo1.setJuego("Fortnite");
        equipo1.setPais("España");
        equipo1.setRankingMundial(7);

        System.out.println("\n---EQUIPO 1---");
        System.out.println("Nombre: " + equipo1.getNombre() + "\nJuego: " + equipo1.getJuego() + "\nPaís: "
                + equipo1.getPais() + "\nRánking Mundial: " + equipo1.getRankingMundial());

        equipo1.setRankingMundial(3);

        System.out.println("\nDespués de la victoria de " + equipo1.getNombre() + " en el europeo de " + equipo1.getJuego()
                + ", ha ascendido hasta el ránking " + equipo1.getRankingMundial() + " mundial!!");
    }
}
