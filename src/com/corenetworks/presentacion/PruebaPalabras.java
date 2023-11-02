package com.corenetworks.presentacion;

import com.corenetworks.modelo.Palabras;

import java.util.Scanner;

public class PruebaPalabras {
    public static void main(String[] args) {


        //pedir el número de palabras - leer por consola
        //leer por consola cada uno de los elementos
//definir variables
        Scanner teclado = new Scanner(System.in);
        int elementos;

        //pedir numero de palabras - leer por consola

        System.out.println("Cuantas pàlabras -> ");
       elementos = teclado.nextInt();
       Palabras p1= new Palabras(elementos);
       teclado.nextLine();
       //estructuras
        for(int i=0;i<elementos;i++){
            System.out.println("escriba una palabra:");
            p1.actualizaElemento(teclado.nextLine(),i);
        }
        for(String elemento: p1.getPalabras()){
            System.out.println(elemento);
        }
    }
}