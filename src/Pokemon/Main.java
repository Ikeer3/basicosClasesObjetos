package Pokemon;

public class Main {
    public static void main(String[] args) {

        Pokemon pokemon1 = new Pokemon();

        pokemon1.setNombre("Snorlax");
        pokemon1.setTipo("Normal");
        pokemon1.setNivel(50);
        pokemon1.setVida(130);

        System.out.println("\n---POKEMON 1---");
        System.out.println("Nombre: " + pokemon1.getNombre() + "\nTipo: " + pokemon1.getTipo() + "\nNivel: "
                + pokemon1.getNivel() + "\nVida: " + pokemon1.getVida());
    }
}
