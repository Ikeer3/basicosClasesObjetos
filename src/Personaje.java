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

    public void recibirDanho(int vida, int ataque) {
        int danho = vida - ataque;
        if (vida <= 0) {
            vida = 0;
            System.out.println("Tu personaje ha muerto!!");
        }
    }

    public void curarse(int vida, int pocion) {
        int cura = vida + pocion;
        if (vida >= 100) {
            vida = 100;
            System.out.println("Tu personaje está full vida!!");
        }
    }

    public void sigueVivo() {
        boolean vivo = false;
        if (vida > 0 && vida <= 100) {
            vivo = true;
            System.out.println("Tu personaje sigue vivo!!");
        }
    }
}
