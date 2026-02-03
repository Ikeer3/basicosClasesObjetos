package Pelicula;

public class Pelicula {

    private String titulo;
    private String director;
    private int anhoEstreno;
    private int duracionMinutos;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tituloEntrada) {
        titulo = tituloEntrada;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String directorEntrada) {
        director = directorEntrada.toUpperCase();
    }

    public int getAnhoEstreno() {
        return anhoEstreno;
    }

    public void setAnhoEstreno(int anhoEstrenoEntrada) {
        anhoEstreno = anhoEstrenoEntrada;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutosEntrada) {
        duracionMinutos = duracionMinutosEntrada;
    }
}
