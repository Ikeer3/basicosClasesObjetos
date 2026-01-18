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

        // ESTA PARTE PRUEBA LA CLASE YOUTUBER

        Youtuber youtuber1 = new Youtuber();
        Youtuber youtuber2 = new Youtuber();
        Youtuber youtuber3 = new Youtuber();

        youtuber1.setNombreCanal("elRubiusOMG");
        youtuber2.setNombreCanal("TheGrefg");
        youtuber3.setNombreCanal("Willyrex");

        youtuber1.setCategoria("Variedad");
        youtuber2.setCategoria("Viajes");
        youtuber3.setCategoria("Videojuegos");

        youtuber1.setNumSubs(8000000);
        youtuber2.setNumSubs(6000000);
        youtuber3.setNumSubs(9000000);

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("\nEl Youtuber " + youtuber2.getNombreCanal() + " tiene: " + youtuber2.getNumSubs() + " suscriptores");

        youtuber2.setNumSubs(11000000);

        System.out.println("Pasados dos meses tiene: " + youtuber2.getNumSubs() + " suscriptores");

        // ESTA PARTE PRUEBA LA CLASE JUGADOR FUTBOL

        JugadorFutbol jugador1 = new JugadorFutbol();

        jugador1.setNombre("Pedri");
        jugador1.setEquipo("FC Barcelona");
        jugador1.setDorsal(3);
        jugador1.setPosicion("Delantero");

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("\n---JUGADOR 1---");
        System.out.println("Nombre: " + jugador1.getNombre() + "\nEquipo: " + jugador1.getEquipo() + "\nDorsal: "
                + jugador1.getDorsal() + "\nPosición: " + jugador1.getPosicion());

        jugador1.setEquipo("Real Deportivo de la Coruña");
        jugador1.setDorsal(10);

        System.out.println("\nTras su fichaje por el " + jugador1.getEquipo() + ", ahora su dorsal es el " + jugador1.getDorsal());

        // ESTA PARTE PRUEBA LA CLASE SKIN

        Skin skin1 = new Skin();
        Skin skin2 = new Skin();

        skin1.setNombre("Demogorgon");
        skin2.setNombre("Darth Vader");

        skin1.setVideojuego("Fortnite");
        skin2.setVideojuego("Valorant");

        skin1.setRareza("Común");
        skin2.setRareza("Épica");

        skin1.setPrecioMonedas(200);
        skin2.setPrecioMonedas(900);

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("\n---SKIN 1---");
        System.out.println("Nombre: " + skin1.getNombre() + "\nVideojuego: " + skin1.getVideojuego() + "\nRareza: "
                + skin1.getRareza() + "\nPrecio en monedas: " + skin1.getPrecioMonedas());
        System.out.println("\n---SKIN 2---");
        System.out.println("Nombre: " + skin2.getNombre() + "\nVideojuego: " + skin2.getVideojuego() + "\nRareza: "
                + skin2.getRareza() + "\nPrecio en monedas: " + skin2.getPrecioMonedas());

        skin1.setRareza("Legendaria");
        skin1.setPrecioMonedas(1500);

        System.out.println("\nDespués de la actualización la skin de " + skin1.getNombre() + " ha cambiado su rareza a "
                + skin1.getRareza() + " con un precio de: " + skin1.getPrecioMonedas() + " monedas");

        // ESTA PARTE PRUEBA LA CLASE POKEMON

        Pokemon pokemon1 = new Pokemon();

        pokemon1.setNombre("Snorlax");
        pokemon1.setTipo("Normal");
        pokemon1.setNivel(50);
        pokemon1.setVida(130);

        // ESTA PARTE PRUEBA LA CLASE MANGA

        Manga manga1 = new Manga();

        manga1.setTitulo("Shingeki no Kyojin");
        manga1.setAutor("Hajime Isayama");
        manga1.setNumVolumen(115);
        manga1.setLeido(true);

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("\n---MANGA 1---");
        System.out.println("Título: " + manga1.getTitulo() + "\nAutor: " + manga1.getAutor() + "\nNúmero de volumen: "
                + manga1.getNumVolumen() + "\nLeído: " + manga1.isLeido());
    }
}