package model;

public class Jugador extends Persona{

    private Integer edad;


    public Jugador(String nombre, String apellido, String email, String celular, Integer edad) {
        super(nombre, apellido, email, celular);
        this.edad = edad;
    }

    public Jugador() {
    }

    //GETTER AND SETTERS

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
