package YouTuber;

public class Main {
    public static void main(String[] args) {

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

        System.out.println("\nEl YouTuber " + youtuber2.getNombreCanal() + " tiene: " + youtuber2.getNumSubs() + " suscriptores");

        youtuber2.setNumSubs(11000000);

        System.out.println("Pasados dos meses tiene: " + youtuber2.getNumSubs() + " suscriptores");
    }
}
