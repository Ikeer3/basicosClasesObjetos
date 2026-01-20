public class BateriaMovil {

    private int porcentaje;

    public BateriaMovil(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public void usar(int minutos) {
        if (porcentaje == 0) {
            System.out.println("El móvil se ha quedado sin batería");
        } else {
            porcentaje--;
        }
    }

    public void cargar(int minutos) {
        if (porcentaje == 100) {
            System.out.println("El móvil tiene el 100% de la batería");
        } else {
            porcentaje++;
        }
    }
}
