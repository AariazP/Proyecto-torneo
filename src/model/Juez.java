package model;

public class Juez extends Persona{

    private String licencia;

    public Juez(String nombre, String apellido, String email, String celular, String licencia) {
        super(nombre, apellido, email, celular);
        this.licencia = licencia;
    }

    public Juez() {

    }

    @Override
    public String toString() {
        return "Juez{" +
                "licencia='" + licencia + '\'' +
                '}' + super.toString();
    }

    //getter y setters



    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
}
