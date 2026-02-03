package Carrito;

public class Carrito {

    private int total;

    public Carrito(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void anhadirProducto() {
        total++;
    }

    public void descuento() {
        if (total < 0 || total == 0) {
            total = 0;
            System.out.println("No se puede aplicar el descuento!!");
        } else {
            total = total / 10;
        }
    }
}
