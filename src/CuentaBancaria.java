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
        saldo = saldo - dinero;
        if (saldo < dinero) {
            System.out.println("Saldo insuficiente!!");
        }
    }

    public void estadoCuenta() {
        System.out.println("La cuenta de " + titular + " tiene un saldo de " + saldo + "$");
    }
}
