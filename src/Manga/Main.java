package Manga;

public class Main {
    public static void main(String[] args) {

        Manga manga1 = new Manga();

        manga1.setTitulo("Shingeki no Kyojin");
        manga1.setAutor("Hajime Isayama");
        manga1.setNumVolumen(115);
        manga1.setLeido(true);

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("\n---MANGA 1---");
        System.out.println("Título: " + manga1.getTitulo() + "\nAutor: " + manga1.getAutor() + "\nNúmero de volumen: "
                + manga1.getNumVolumen() + "\nLeído: " + manga1.isLeido());
    }
}
