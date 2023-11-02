package com.corenetworks.modelo;

public class Palabras {
    private String [] palabras ;

    public void actualizaElemento (String contenido, int posicion){
        //este metodo tiene que: Contenido se guarda en array en la posicion
        palabras[posicion]=contenido;
    }



    public Palabras(int elementos) {
        palabras=new String[elementos];
    }



    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }
}
