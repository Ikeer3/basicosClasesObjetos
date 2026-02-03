package Marcador;

public class Marcador {

    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public Marcador(String equipoLocal, String equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        golesLocal = 0;
        golesVisitante = 0;
    }

    public void golLocal() {
        golesLocal++;
    }

    public void golVisitante() {
        golesVisitante++;
    }

    public String resultado() {
        return golesLocal + " - " + golesVisitante;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }
}
