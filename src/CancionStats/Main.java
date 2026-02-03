package CancionStats;

public class Main {
    public static void main(String[] args) {

        CancionStats cancionStats1 = new CancionStats("Radioactive");

        System.out.println("\nAntes del lanzamiento de " + cancionStats1.getTitulo() + " el número de reproducciones era: "
                + cancionStats1.getNumReproducciones());

        for (int i = 0; i < 1000; i++) {
            cancionStats1.reproducir();
        }

        System.out.println("Tras su éxito, el número total de reproducciones de " + cancionStats1.getTitulo() +
                " fue: " + cancionStats1.getNumReproducciones());
    }
}
