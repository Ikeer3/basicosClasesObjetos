package CancionStats;

public class CancionStats {

    private String titulo;
    private int numReproducciones;

    public CancionStats(String titulo) {
        this.titulo = titulo;
        numReproducciones = 0;
    }

    public void reproducir() {
        numReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumReproducciones() {
        return numReproducciones;
    }
}
