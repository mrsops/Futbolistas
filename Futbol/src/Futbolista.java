public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
        super();
    }

    public Futbolista(int edad, String nombre, String apellidos, int id, int dorsal, String demarcacion) {
        super(edad, nombre, apellidos, id);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void entrenar(){

    }

    public void jugarPartido(){

    }
}
