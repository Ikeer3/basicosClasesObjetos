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

    public void recibirDanho() {
        vida = vida - ataque;
        if (vida <= 0) {
            vida = 0;
        }
    }

    public void curarse(int pocion) {
        vida = vida + pocion;
        if (vida >= 100) {
            vida = 100;
            System.out.println("Tu personaje está full vida!!");
        }
    }

    public void sigueVivo() {
        if (vida > 0 && vida <= 100) {
            System.out.println("Tu personaje sigue vivo!!");
        } else {
            System.out.println("Tu personaje ha muerto!!");
        }
    }
}
