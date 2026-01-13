public class Main {
    public static void main(String[] args) {

        // ESTA PARTE PRUEBA LA CLASE CANCIÓN

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

        // ESTA PARTE PRUEBA LA CLASE PELÍCULA

        Pelicula pelicula1 = new Pelicula();
        Pelicula pelicula2 = new Pelicula();

        pelicula1.setTitulo("Whiplash");
        pelicula2.setTitulo("Interstellar");

        pelicula1.setDirector("Damien Chazelle");
        pelicula2.setDirector("Christopher Nolan");

        pelicula1.setAnhoEstreno(2014);
        pelicula2.setAnhoEstreno(2014);

        pelicula1.setDuracionMinutos(107);
        pelicula2.setDuracionMinutos(169);

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("\n---PELÍCULA 1---");
        System.out.println("Título: " + pelicula1.getTitulo() + "\nDirector: " + pelicula1.getDirector() + "\nAño de estreno: "
                + pelicula1.getAnhoEstreno() + "\nDuración en minutos: " + pelicula1.getDuracionMinutos());
        System.out.println("\n---PELÍCULA 2---");
        System.out.println("Título: " + pelicula2.getTitulo() + "\nDirector: " + pelicula2.getDirector() + "\nAño de estreno: "
                + pelicula2.getAnhoEstreno() + "\nDuración en minutos: " + pelicula2.getDuracionMinutos());
    }
}