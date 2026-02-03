package Cancion;

public class Cancion {

    private String titulo;
    private String artista;
    private int duracionSegundos;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tituloEntrada) {
        titulo = tituloEntrada;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artistaEntrada) {
        artista = artistaEntrada;
    }

    public int getDuracion() {
        return duracionSegundos;
    }

    public void setDuracion(int duracionEntrada) {
        duracionSegundos = duracionEntrada;
    }
}
