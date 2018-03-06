import java.util.ArrayList;

public class App {
    public static ArrayList<SeleccionFutbol> seleçao = new ArrayList<SeleccionFutbol>();
    public static void main(String[] args) {
        Entrenador pepe = new Entrenador(40, "Pepe", "Pepetulio", 50, 40);
        Masajista maritsa = new Masajista(25, "Maritsa", "Miraverde", 35, "Happy Endings", 5);
        Futbolista julian = new Futbolista(27, "Julian", "DelReves", 37, 67, "Punta");

        seleçao.add(pepe);
        seleçao.add(maritsa);
        seleçao.add(julian);


        //CONCENTRACION

        System.out.println("Todos los integrantes comienzan una concentracion. ");
        for (SeleccionFutbol seleccionado:seleçao) {
            System.out.println(seleccionado.getNombre()+" "+seleccionado.getApellidos());
            seleccionado.concentrarse();
        }

        //VIAJE

        System.out.println("Los seleccionados se preparan para jugarPartido un partido (Masajistas y entrenadores incluidos)");
        for (SeleccionFutbol jugadores:seleçao) {
            jugadores.viajar();
        }

        //ENTRENAMIENTO
        System.out.println("Entrenamiento. Solo entrenador y futbolista tienen metodo de entrenar");
        System.out.println(pepe.getNombre()+" "+pepe.getApellidos());
        pepe.dirigirEntreno();
        System.out.println(julian.getNombre()+" "+julian.getApellidos());
        julian.entrenar();

        //MASAJE
        System.out.println(maritsa.getNombre()+" "+maritsa.getApellidos());
        maritsa.darMasaje();


        //PARTIDO DE FUTBOL
        System.out.println("Realizzazione dell partito ben attesa da tutti.");
        System.out.println(pepe.getNombre()+" "+pepe.getApellidos());
        pepe.dirigirPartido();
        System.out.println(julian.getNombre()+" "+julian.getApellidos());
        julian.jugarPartido();

    }
}
