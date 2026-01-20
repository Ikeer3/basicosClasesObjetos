public class BateriaMovil {

    private int porcentaje;

    public BateriaMovil(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void usar(int minutos) {
        if (minutos > porcentaje) {
            System.out.println("\nEl móvil se ha quedado sin batería");
        } else {
            int porcentajeEntrada = minutos / 1;
            porcentaje = porcentaje - porcentajeEntrada;
        }
    }

    public void cargar(int minutos) {
        if (porcentaje == 100) {
            System.out.println("El móvil tiene el 100% de la batería");
        } else {
            porcentaje = minutos * 10;
        }
    }
}
