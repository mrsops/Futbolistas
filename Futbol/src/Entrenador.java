public class Entrenador extends SeleccionFutbol {
    private int idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int edad, String nombre, String apellidos, int id, int idFederacion) {
        super(edad, nombre, apellidos, id);
        this.idFederacion = idFederacion;
    }

    public void dirigirEntreno(){

    }
    public void dirigirPartido(){

    }



}
