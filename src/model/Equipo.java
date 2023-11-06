package model;

public class Equipo {


    private String nombre;

    private Representante representante;

    private Jugador[] listaJugadores;

    private Enfrentamiento[] listaEnfrentamientos;


    public Equipo(String nombre, Representante representante, Jugador[] listaJugadores) {
        this.nombre = nombre;
        this.representante = representante;
        this.listaJugadores = listaJugadores;
    }

    public Equipo() {
    }

    //GETTER AND SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public Jugador[] getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(Jugador[] listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
}
