package model;

public class Representante extends Persona{
    private Equipo[] listaRepresentado;

    public Representante(String nombre, String apellido, String email, String celular) {
        super(nombre, apellido, email, celular);
        this.listaRepresentado = new Equipo[1];
    }

    public Representante() {
        this.listaRepresentado = new Equipo[1];
    }


    //GETTER AND SETTER

    public Equipo[] getListaRepresentado() {
        return listaRepresentado;
    }

    public void setListaRepresentado(Equipo[] listaRepresentado) {
        this.listaRepresentado = listaRepresentado;
    }
}
