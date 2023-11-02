package com.corenetworks.presentacion;

import com.corenetworks.modelo.Ordenador;

public class PruebaOrdenador {
    public static void main(String[] args) {
        //array ordenadors
        //String[]nombres=new String[4];
        Ordenador[] ordenadores = new Ordenador[4];
        //rellenar el array
        //for(int i=0; i<nombres.length;i++){
        for (int i = 0; i < ordenadores.length; i++) {
            ordenadores[i] = new Ordenador("1342", "Opium", true);
        }
        for(Ordenador elemento:ordenadores){
            System.out.println(elemento);
        }
    }
}
