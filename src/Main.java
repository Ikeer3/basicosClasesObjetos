public class Main {
    public static void main(String[] args) {

        // Creamos dos objetos canción
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion();

        // Setters con los títulos de las dos canciones
        cancion1.setTitulo("I Bet my Life");
        cancion2.setTitulo("Paradise");

        // Setters con los nombres de los dos artistas
        cancion1.setArtista("Imagine Dragons");
        cancion2.setArtista("Coldplay");

        // Setters con la duración en segundos de las dos canciones
        cancion1.setDuracion(180);
        cancion2.setDuracion(240);

        System.out.println("\n---CANCION 1---");
        System.out.println("Título: " + cancion1.getTitulo() + "\nArtista: " + cancion1.getArtista()
                + "\nDuración: " + cancion1.getDuracion() + " segundos");

        System.out.println("\n---CANCION 2---");
        System.out.println("Título: " + cancion2.getTitulo() + "\nArtista: " + cancion2.getArtista()
                + "\nDuración: " + cancion2.getDuracion() + " segundos");

        cancion1.setDuracion(270);

        if (cancion1.getDuracion() > cancion2.getDuracion()) {
            System.out.println("\nLa canción más larga es: " + cancion1.getTitulo() + ", con una duración de: "
                    + cancion1.getDuracion() + " segundos");
        } else {
            System.out.println("\nLa canción más larga es: " + cancion2.getTitulo() + ", con una duración de: "
                    + cancion2.getDuracion() + " segundos");
        }
    }
}