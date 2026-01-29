public class CuentaBancaria {

    private String titular;
    private int saldo;

    public CuentaBancaria(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void ingresar(int dinero) {
        saldo = saldo + dinero;
    }

    public void retirar(int dinero) {
        if (saldo < dinero) {
            System.out.println("Saldo insuficiente!!");
        } else {
            saldo = saldo - dinero;
        }
    }

    public void estadoCuenta() {
        System.out.println("\nLa cuenta de " + titular + " tiene un saldo de " + saldo + "$");
    }
}
