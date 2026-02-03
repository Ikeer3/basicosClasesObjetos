package BateriaMovil;

public class BateriaMovil {

    private int porcentaje;

    public BateriaMovil(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void usar(int minutos) {
        porcentaje = porcentaje - (minutos / 1);
        if (porcentaje <= 0) {
            porcentaje = 0;
            System.out.println("\nEl móvil se ha quedado sin batería");
        }
    }

    public void cargar(int minutos) {
        porcentaje = porcentaje + (minutos / 2);
        if (porcentaje >= 100) {
            porcentaje = 100;
            System.out.println("El móvil ya tiene el 100% de la batería");
        }
    }
}
