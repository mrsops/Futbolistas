public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {
        super();
    }

    public Masajista(int edad, String nombre, String apellidos, int id, String titulacion, int aniosExperiencia) {
        super(edad, nombre, apellidos, id);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje(){

    }
}
