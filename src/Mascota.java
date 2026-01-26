public class Mascota {

    private String nombre;
    private int hambre;

    public Mascota(String nombre, int hambre) {
        this.nombre = nombre;
        if (this.hambre < 0) {
            this.hambre = 0;
        } else {
            this.hambre = 100;
        }
    }

    public void comer() {
        // Reducir hambre
        hambre = hambre - 25;
        if (hambre < 0) {
            hambre = 0;
        }
    }

    public void pasarTiempo(int horas) {
        // Aumentar hambre
        if (horas < 0) {
            horas = 0;
        }
        hambre = hambre + 5 * horas;
        if (hambre > 100) {
            hambre = 100;
        }
    }

    public void mostrarEstado() {
        System.out.println("El nivel de hambre de " + nombre + " es " + hambre);
    }
}
