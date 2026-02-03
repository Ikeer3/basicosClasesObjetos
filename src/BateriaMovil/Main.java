package BateriaMovil;

public class Main {
    public static void main(String[] args) {

        BateriaMovil movil1 = new BateriaMovil(100);

        int minutos = 80;

        movil1.usar(minutos);
        System.out.println("\nCarlos ha usado el móvil " + minutos + " minutos y le queda un " + movil1.getPorcentaje()
                + "% de batería");

        minutos = 50;
        movil1.cargar(minutos);
        System.out.println("\nCarlos ha cargado el móvil " + minutos + " minutos y le queda un " + movil1.getPorcentaje()
                + "% de batería");
    }
}
