package com.corenetworks.presentacion;

import com.corenetworks.modelo.Proyecto;

import java.util.Scanner;

public class PruebaProyecto {
    public static void main(String[] args) {
        Proyecto p1=new Proyecto(23,"Instalacion Turbo",10,60);
        System.out.println("Importe: "+ p1.calcularImporte()+"€");
        System.out.println("Importe -20% descuento (cliente habitual): "+ p1.calcularImporte(0.2)+"€");
        System.out.println(p1.toString());
// pedir datos por Scanner
        Scanner teclado = new Scanner(System.in);
        double descuentoPresentación;
        System.out.println("Introduzca el descuento(debe ser decimal entre  0 y 1");
        descuentoPresentación=teclado.nextDouble();
        System.out.println("Importe con descuento: "+ p1.calcularImporte(descuentoPresentación));



    }
}
