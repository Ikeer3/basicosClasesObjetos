package Skin;

public class Skin {

    private String nombre;
    private String videojuego;
    private String rareza;
    private int precioMonedas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreEntrada) {
        nombre = nombreEntrada;
    }

    public String getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(String videjuegoEntrada) {
        videojuego = videjuegoEntrada;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rarezaEntrada) {
        rareza = rarezaEntrada;
    }

    public int getPrecioMonedas() {
        return precioMonedas;
    }

    public void setPrecioMonedas(int precioMonedasEntrada) {
        precioMonedas = precioMonedasEntrada;
    }
}
