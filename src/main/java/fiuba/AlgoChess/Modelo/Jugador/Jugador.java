package fiuba.AlgoChess.Modelo.Jugador;

import fiuba.AlgoChess.Modelo.Unidad.Entidad;

import java.util.Scanner;

public class Jugador {

    private String nombre;
    private int puntos;
    private int cantidadEntidades = 0;
    Scanner consola = new Scanner(System.in);

    public Jugador(String nombre){

        this.nombre = nombre;
        this.puntos = 20;
    }


    public boolean agregarEntidad(Entidad unaEntidad){
        //Hacer que la entidad se reste a ella misma de loos puntos
        if(this.puntos >= unaEntidad.getCosto()){ //precioentidad

            this.puntos-= unaEntidad.getCosto();
            this.cantidadEntidades ++;
            return true;

        }else{
            return false;
        }

    }

    //funciona como controlador de estado de jugador.
    public boolean sigueJugando() {

        return(this.cantidadEntidades > 0);
    }

    public int[] elegirCasillero(){

        int[] array = new int[2];

        System.out.println("Ingresa fila: ");
        array[0] = consola.nextInt();

        System.out.println("Ingresa columna: ");
        array[1] = consola.nextInt();

        return array;
    }




    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}