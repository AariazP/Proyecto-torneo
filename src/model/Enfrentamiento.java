package model;

import java.time.LocalDate;

public class Enfrentamiento {


    private LocalDate fecha;
    private String hora;
    private String ubicacion;
    private Lugar lugar;
    private DetalleEnfrentamiento detalleEnfrentamiento;
    private String estado;
    private Equipo[] listaEquipos;

    public Enfrentamiento(LocalDate fecha, String hora, String ubicacion, Lugar lugar) {
        this.fecha = fecha;
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.lugar = lugar;
        this.detalleEnfrentamiento = new DetalleEnfrentamiento();
        this.listaEquipos = new Equipo[2];
        estado = Estado.PENDIENTE;
    }

    public Enfrentamiento() {
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}


