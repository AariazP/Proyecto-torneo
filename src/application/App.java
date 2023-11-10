package application;

import model.*;

import java.time.LocalDate;

public class App {

    private  static  Torneo torneo;

    public static void main(String[] args) {
        torneo = new Torneo();
        crearEnfrentamientos();
        Juez juez = new Juez();
        juez.setNombre("Juez 1");
        juez.setLicencia("1");
        torneo.agregarJuez(juez);

        buscarJuezPorLicencia("1");
    }

    public static void buscarJuezPorLicencia(String licencia){

        Persona[] listaPersonas = torneo.getListaPersonas();


        for(int i=0; i<listaPersonas.length; i++){
           Persona persona = listaPersonas[i];
           if(persona instanceof Juez &&  ((Juez) persona).getLicencia().equals(licencia)){
               System.out.println(" Encontré el juez");
               System.out.println("La informacion del juez es " + persona );
               break;
           }
        }
    }


    public static void crearEnfrentamientos(){
        System.out.println("Creando torneos...");
    }


}


