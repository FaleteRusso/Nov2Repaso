package com.corenetworks.presentacion;

import java.util.Scanner;

public class ProbarArrays {
    public static void main(String[] args) {
        //Definir un array de 5 letras - char.
        char[]letra=new char[5];

        letra[0]= 'a';
        letra[1]= 'e';
        letra[2]= 'i';
        letra[3]= 'o';
        letra[4]= 'u';
        //recorrer Array, siempre bucle

        for(int i = 0; i< letra.length;i++){
            System.out.println("Elemento "+ i + " ->"+ letra[i]);
        }
        //for each(muestra lo que hay dentro del array(lo recorre) pero no da posiciones
        for(char elemento:letra){
            System.out.println(elemento);
        }
        //tipos de forma de definir array
        //String[]palabras; no sabemos numero de elementos
        //String []palabras={x,x,x} sabemos los elementos.

        //Definir Array de String de 3 elementos
        //pedir por consola los 3 elementos
        String[]palabras =new String[3];
        Scanner teclado =new Scanner(System.in);
        for (int i=0; i< palabras.length;i++){
        System.out.println("Escriba una palabra ->");
        palabras[i]=teclado.nextLine();
        }
for(String elemento:palabras){
    System.out.println(elemento);

    }
}
}
