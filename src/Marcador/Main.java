package Marcador;

public class Main {
    public static void main(String[] args) {

        Marcador marcador1 = new Marcador("RC Deportivo", "FC Barcelona");

        System.out.println("\nPartido entre el " + marcador1.getEquipoLocal() + " VS " + marcador1.getEquipoVisitante());
        marcador1.golLocal();
        System.out.println("\nMinuto 37 - " + "GOOOL!! del " + marcador1.getEquipoLocal());
        System.out.println(marcador1.resultado());
        marcador1.golVisitante();
        System.out.println("\nMinuto 71 - " + "GOOOL!! del " + marcador1.getEquipoVisitante());
        System.out.println(marcador1.resultado());
        marcador1.golLocal();
        System.out.println("\nMinuto 91 - " + "GOOOL!! del " + marcador1.getEquipoLocal());
        System.out.println(marcador1.resultado());
        System.out.println("\nFinal del Partido");
        System.out.println(marcador1.resultado());
    }
}
