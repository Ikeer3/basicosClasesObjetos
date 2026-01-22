public class Personaje {

    private String nombre;
    private int vida;
    private int ataque;

    public Personaje(int vida, int ataque, String nombre) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }
}
