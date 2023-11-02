package com.corenetworks.presentacion;

import com.corenetworks.modelo.Vendedor;

public class PruebaVendedor {
    public static void main(String[] args) {
        Vendedor v1= new Vendedor(23,2_000,"51986879G","Angél",1_000,0.01);
        System.out.println("sueldo: " + v1.calcularSueldo());
        System.out.println("impuesto: "+ v1.calcularImpuesto());
        System.out.println(v1.toString());
    }

}
