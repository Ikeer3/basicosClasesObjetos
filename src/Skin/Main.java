package Skin;

public class Main {
    public static void main(String[] args) {

        Skin skin1 = new Skin();
        Skin skin2 = new Skin();

        skin1.setNombre("Demogorgon");
        skin2.setNombre("Darth Vader");

        skin1.setVideojuego("Fortnite");
        skin2.setVideojuego("Valorant");

        skin1.setRareza("Común");
        skin2.setRareza("Épica");

        skin1.setPrecioMonedas(200);
        skin2.setPrecioMonedas(900);

        System.out.println("\n---SKIN 1---");
        System.out.println("Nombre: " + skin1.getNombre() + "\nVideojuego: " + skin1.getVideojuego() + "\nRareza: "
                + skin1.getRareza() + "\nPrecio en monedas: " + skin1.getPrecioMonedas());
        System.out.println("\n---SKIN 2---");
        System.out.println("Nombre: " + skin2.getNombre() + "\nVideojuego: " + skin2.getVideojuego() + "\nRareza: "
                + skin2.getRareza() + "\nPrecio en monedas: " + skin2.getPrecioMonedas());

        skin1.setRareza("Legendaria");
        skin1.setPrecioMonedas(1500);

        System.out.println("\nDespués de la actualización la skin de " + skin1.getNombre() + " ha cambiado su rareza a "
                + skin1.getRareza() + " con un precio de: " + skin1.getPrecioMonedas() + " monedas");
    }
}
