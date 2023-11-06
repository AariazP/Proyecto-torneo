package model;

import java.time.LocalDate;

public class Torneo {

    private LocalDate fechaInicio;
    private LocalDate fechaInicioInscripcion;
    private LocalDate fechaCierreInscripcion;
    private Integer numeroParticipantes;
    private Integer limiteEdad;
    private Double valorInscripcion;
    private Persona[] listaPersonas;
    private String tipoTorneo;
    private Genero genero;

    private Equipo[] listaEquipos;

    public Torneo(LocalDate fechaInicio, LocalDate fechaInicioInscripcion, LocalDate fechaCierreInscripcion,
                  Integer numeroParticipantes, Integer limiteEdad, Double valorInscripcion) {
        this.fechaInicio = fechaInicio;
        this.fechaInicioInscripcion = fechaInicioInscripcion;
        this.fechaCierreInscripcion = fechaCierreInscripcion;
        this.numeroParticipantes = numeroParticipantes;
        this.limiteEdad = limiteEdad;
        this.valorInscripcion = valorInscripcion;
        listaPersonas = new Persona[100];
        listaEquipos = new Equipo[8];
    }

    public Torneo() {
        listaPersonas = new Persona[100];
    }

    //getters y setters

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaInicioInscripcion() {
        return fechaInicioInscripcion;
    }

    public void setFechaInicioInscripcion(LocalDate fechaInicioInscripcion) {
        this.fechaInicioInscripcion = fechaInicioInscripcion;
    }

    public LocalDate getFechaCierreInscripcion() {
        return fechaCierreInscripcion;
    }

    public void setFechaCierreInscripcion(LocalDate fechaCierreInscripcion) {
        this.fechaCierreInscripcion = fechaCierreInscripcion;
    }

    public Integer getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(Integer numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public Integer getLimiteEdad() {
        return limiteEdad;
    }

    public void setLimiteEdad(Integer limiteEdad) {
        this.limiteEdad = limiteEdad;
    }

    public Double getValorInscripcion() {
        return valorInscripcion;
    }

    public void setValorInscripcion(Double valorInscripcion) {
        this.valorInscripcion = valorInscripcion;
    }

    public Persona[] getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(Persona[] listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public String getTipoTorneo() {
        return tipoTorneo;
    }

    public void setTipoTorneo(String tipoTorneo) {
        this.tipoTorneo = tipoTorneo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Equipo[] getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(Equipo[] listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public void agregarJuez(Juez juez) {

        for(int i=0; i<listaPersonas.length; i++){

            if(listaPersonas[i] == null){
                listaPersonas[i] = juez;
            }
        }

    }
}
