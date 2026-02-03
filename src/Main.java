import BateriaMovil.BateriaMovil;

public class Main {
    public static void main(String[] args) {

        // ESTA PARTE PRUEBA LA CLASE PERSONAJE

        Personaje personaje1 = new Personaje(100, 40, "Joel");

        int pocion = 30;

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("\n" + personaje1.getNombre() + " tiene " + personaje1.getVida() + " puntos de vida");
        personaje1.recibirDanho();
        System.out.println(personaje1.getNombre() + " recibe un ataque, ahora le quedan " + personaje1.getVida()
                + " puntos de vida");
        personaje1.sigueVivo();
        personaje1.recibirDanho();
        System.out.println(personaje1.getNombre() + " recibe otro ataque y le quedan " + personaje1.getVida() + " puntos de vida");
        personaje1.sigueVivo();
        personaje1.recibirDanho();
        System.out.println(personaje1.getNombre() + " recibe otro ataque y le quedan " + personaje1.getVida() + " puntos de vida");
        personaje1.sigueVivo();
        personaje1.curarse(pocion);
        System.out.println(personaje1.getNombre() + " se cura y le quedan " + personaje1.getVida() + " puntos de vida");
        personaje1.sigueVivo();

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