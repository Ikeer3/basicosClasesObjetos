public class Marcador {

    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public void golLocal() {
        ;
    }

    public void golVisitante() {
        golesVisitante++;
    }

    public int resultado(int golesLocal, int golesVisitante) {
        return golesLocal - golesVisitante;
    }
}
