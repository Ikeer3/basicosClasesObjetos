package Pelicula;

public class Main {
    public static void main(String[] args) {

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

        System.out.println("\n---PELÍCULA 1---");
        System.out.println("Título: " + pelicula1.getTitulo() + "\nDirector: " + pelicula1.getDirector() + "\nAño de estreno: "
                + pelicula1.getAnhoEstreno() + "\nDuración en minutos: " + pelicula1.getDuracionMinutos());
        System.out.println("\n---PELÍCULA 2---");
        System.out.println("Título: " + pelicula2.getTitulo() + "\nDirector: " + pelicula2.getDirector() + "\nAño de estreno: "
                + pelicula2.getAnhoEstreno() + "\nDuración en minutos: " + pelicula2.getDuracionMinutos());
    }
}
