public class Main {
    public static void main(String[] args) {

        // ESTA PARTE PRUEBA LA CLASE CANCIÓN

        // Creamos dos objetos canción
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion();
        Cancion cancion3 = new Cancion();
        Cancion cancion4 = new Cancion();

        // Setters con los títulos de las dos canciones
        cancion1.setTitulo("I Bet my Life");
        cancion2.setTitulo("Paradise");
        cancion3.setTitulo("Dtmf");
        cancion4.setTitulo("Bajo la piel");

        // Setters con los nombres de los dos artistas
        cancion1.setArtista("Imagine Dragons");
        cancion2.setArtista("Coldplay");
        cancion3.setArtista("Bad Bunny");
        cancion4.setArtista("Milo J");

        // Setters con la duración en segundos de las dos canciones
        cancion1.setDuracion(180);
        cancion2.setDuracion(240);
        cancion3.setDuracion(190);
        cancion4.setDuracion(210);

        System.out.println("\n---CANCION 1---");
        System.out.println("Título: " + cancion1.getTitulo() + "\nArtista: " + cancion1.getArtista()
                + "\nDuración: " + cancion1.getDuracion() + " segundos");

        System.out.println("\n---CANCION 2---");
        System.out.println("Título: " + cancion2.getTitulo() + "\nArtista: " + cancion2.getArtista()
                + "\nDuración: " + cancion2.getDuracion() + " segundos");

        System.out.println("\n---CANCION 3---");
        System.out.println("Título: " + cancion3.getTitulo() + "\nArtista: " + cancion3.getArtista()
                + "\nDuración: " + cancion3.getDuracion() + " segundos");

        System.out.println("\n---CANCION 4---");
        System.out.println("Título: " + cancion4.getTitulo() + "\nArtista: " + cancion4.getArtista()
                + "\nDuración: " + cancion4.getDuracion() + " segundos");

        // Ejemplo de un Array de una Clase con Objetos
        Cancion[] canciones = new Cancion[4];

        canciones[0] = cancion1;
        canciones[1] = cancion2;
        canciones[2] = cancion3;
        canciones[3] = cancion4;

        Cancion cancionLarga = canciones[0];

        // Bucle para conocer la canción más larga
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i].getDuracion() > cancionLarga.getDuracion()) {
                cancionLarga = canciones[i];
            }
        }
        System.out.println("\nLa canción mas larga es: " + cancionLarga.getTitulo() + " y dura: "
                + cancionLarga.getDuracion() + " segundos");

        // if (cancion1.getDuracion() > cancion2.getDuracion()) {
        //    System.out.println("\nLa canción más larga es: " + cancion1.getTitulo() + ", con una duración de: "
        //            + cancion1.getDuracion() + " segundos");
        //} else {
        //    System.out.println("\nLa canción más larga es: " + cancion2.getTitulo() + ", con una duración de: "
        //            + cancion2.getDuracion() + " segundos");
        //}

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