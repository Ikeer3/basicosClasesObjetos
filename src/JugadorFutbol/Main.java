package JugadorFutbol;

public class Main {
    public static void main(String[] args) {

        JugadorFutbol jugador1 = new JugadorFutbol();

        jugador1.setNombre("Pedri");
        jugador1.setEquipo("FC Barcelona");
        jugador1.setDorsal(3);
        jugador1.setPosicion("Delantero");

        System.out.println("\n---JUGADOR 1---");
        System.out.println("Nombre: " + jugador1.getNombre() + "\nEquipo: " + jugador1.getEquipo() + "\nDorsal: "
                + jugador1.getDorsal() + "\nPosición: " + jugador1.getPosicion());

        jugador1.setEquipo("Real Deportivo de la Coruña");
        jugador1.setDorsal(10);

        System.out.println("\nTras su fichaje por el " + jugador1.getEquipo() + ", ahora su dorsal es el " + jugador1.getDorsal());
    }
}
