import Skin.Skin;

public class Main {
    public static void main(String[] args) {

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

        // ESTA PARTE PRUEBA LA CLASE EQUIPO ESPORTS

        EquipoEsports equipo1 = new EquipoEsports();

        equipo1.setNombre("Heretics");
        equipo1.setJuego("Fortnite");
        equipo1.setPais("España");
        equipo1.setRankingMundial(7);

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("\n---EQUIPO 1---");
        System.out.println("Nombre: " + equipo1.getNombre() + "\nJuego: " + equipo1.getJuego() + "\nPaís: "
                + equipo1.getPais() + "\nRánking Mundial: " + equipo1.getRankingMundial());

        equipo1.setRankingMundial(3);

        System.out.println("\nDespués de la victoria de " + equipo1.getNombre() + " en el europeo de " + equipo1.getJuego()
                + ", ha ascendido hasta el ránking " + equipo1.getRankingMundial() + " mundial!!");

        // ESTA PARTE PRUEBA LA CLASE CANCIÓN STATS

        CancionStats cancionStats1 = new CancionStats("Radioactive");

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("\nAntes del lanzamiento de " + cancionStats1.getTitulo() + " el número de reproducciones era: "
                + cancionStats1.getNumReproducciones());

        for (int i = 0; i < 1000; i++) {
            cancionStats1.reproducir();
        }

        System.out.println("Tras su éxito, el número total de reproducciones de " + cancionStats1.getTitulo() +
                " fue: " + cancionStats1.getNumReproducciones());

        // ESTA PARTE PRUEBA LA CLASE MARCADOR

        Marcador marcador1 = new Marcador("RC Deportivo", "FC Barcelona");

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("\nPartido entre el " + marcador1.getEquipoLocal() + " VS " + marcador1.getEquipoVisitante());
        marcador1.golLocal();
        System.out.println("\nMinuto 37 - " + "GOOOL!! del " + marcador1.getEquipoLocal());
        System.out.println(marcador1.resultado());
        marcador1.golVisitante();
        System.out.println("\nMinuto 71 - " + "GOOOL!! del " + marcador1.getEquipoVisitante());
        System.out.println(marcador1.resultado());
        marcador1.golLocal();
        System.out.println("\nMinuto 91 - " + "GOOOL!! del " + marcador1.getEquipoLocal());
        System.out.println(marcador1.resultado());
        System.out.println("\nFinal del Partido");
        System.out.println(marcador1.resultado());

        // ESTA PARTE PRUEBA LA CLASE BATERÍA MÓVIL

        BateriaMovil movil1 = new BateriaMovil(100);

        int minutos = 80;

        System.out.println("\n---------------------------------------------------------------------------------------");

        movil1.usar(minutos);
        System.out.println("\nCarlos ha usado el móvil " + minutos + " minutos y le queda un " + movil1.getPorcentaje()
                    + "% de batería");

        minutos = 50;
        movil1.cargar(minutos);
        System.out.println("\nCarlos ha cargado el móvil " + minutos + " minutos y le queda un " + movil1.getPorcentaje()
                + "% de batería");

        // ESTA PARTE PRUEBA LA CLASE PERSONAJE

        Personaje personaje1 = new Personaje(100, 40, "Joel");

        int pocion = 30;

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("\n" + personaje1.getNombre() + " tiene " + personaje1.getVida() + " puntos de vida");
        personaje1.recibirDanho();
        System.out.println(personaje1.getNombre() + " recibe un ataque, ahora le quedan " + personaje1.getVida()
                + " puntos de vida");
        personaje1.sigueVivo();
        personaje1.recibirDanho();
        System.out.println(personaje1.getNombre() + " recibe otro ataque y le quedan " + personaje1.getVida() + " puntos de vida");
        personaje1.sigueVivo();
        personaje1.recibirDanho();
        System.out.println(personaje1.getNombre() + " recibe otro ataque y le quedan " + personaje1.getVida() + " puntos de vida");
        personaje1.sigueVivo();
        personaje1.curarse(pocion);
        System.out.println(personaje1.getNombre() + " se cura y le quedan " + personaje1.getVida() + " puntos de vida");
        personaje1.sigueVivo();

        // ESTA PARTE PRUEBA LA CLASE CUENTA BANCARIA

        CuentaBancaria cuenta1 = new CuentaBancaria("Iker", 1000);

        System.out.println("\n---------------------------------------------------------------------------------------");
        cuenta1.estadoCuenta();
        System.out.println("Retiro de 500$");
        cuenta1.retirar(500);
        cuenta1.estadoCuenta();

        System.out.println("Ingreso de 600$");
        cuenta1.ingresar(600);
        cuenta1.estadoCuenta();
    }
}