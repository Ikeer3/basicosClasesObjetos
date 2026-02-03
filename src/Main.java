import Personaje.Personaje;

public class Main {
    public static void main(String[] args) {

        // ESTA PARTE PRUEBA LA CLASE CUENTA BANCARIA

        CuentaBancaria cuenta1 = new CuentaBancaria("Iker", 1000);

        System.out.println("\n---------------------------------------------------------------------------------------");
        cuenta1.estadoCuenta();
        System.out.println("Retiro de 500$");
        cuenta1.retirar(500);
        cuenta1.estadoCuenta();

        System.out.println("Ingreso de 600$");
        cuenta1.ingresar(600);
        cuenta1.estadoCuenta();
    }
}