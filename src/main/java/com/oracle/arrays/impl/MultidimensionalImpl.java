package com.oracle.arrays.impl;

import com.oracle.arrays.Multidimensional;
import com.oracle.arrays.model.Posicion;

public class MultidimensionalImpl implements Multidimensional {
    @Override
    public Posicion getPosition(String[][] datos, String dato) {
        Posicion pos;
        //System.out.println(datos[0].length);
        //System.out.println(datos[1].length);

        for(int i = 0; i < datos.length ;i++){
            for(int j = 0; j < datos[i].length ;j++){
                if(datos[i][j] == dato){
                    //System.out.println(i + " + " +j);
                    return pos = new Posicion(1,2);
                }
            }
        }
        //System.out.println("null");
        return null;
    }

    @Override
    public String getData(String[][] datos, Posicion posicion) {
        int x = posicion.getX();
        int y = posicion.getY();
        String dato;
        dato = datos[x][y];
        return dato;
    }
}
