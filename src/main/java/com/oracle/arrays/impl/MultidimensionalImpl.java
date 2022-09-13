package com.oracle.arrays.impl;

import com.oracle.arrays.Multidimensional;
import com.oracle.arrays.model.Posicion;

public class MultidimensionalImpl implements Multidimensional {
    @Override
    public Posicion getPosition(String[][] datos, String dato) {
        // Coding
        for(int i=0; i<datos.length; i++){
            for(int j=0; j<datos[i].length; j++){
                if(datos[i][j].equals(dato)){
                    return new Posicion(i,j);
                }
            }
        }
        return null;
    }

    @Override
    public String getData(String[][] datos, Posicion posicion) {
        //Coding
        int x = posicion.getX();
        int y = posicion.getY();
        return datos[x][y];
    }
}
