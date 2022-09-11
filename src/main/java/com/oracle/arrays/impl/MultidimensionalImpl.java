package com.oracle.arrays.impl;

import com.oracle.arrays.Multidimensional;
import com.oracle.arrays.model.Posicion;

public class MultidimensionalImpl implements Multidimensional {
    @Override
    public Posicion getPosition(String[][] datos, String dato) {
        for(int i=0;i< datos.length;i++){
            int j=0;
            while(j<datos[i].length){
                if(datos[i][j].equals(dato)){
                    return new Posicion(i,j);
                }
                j+=1;
            }
        }
        return null;
    }

    @Override
    public String getData(String[][] datos, Posicion posicion) {
        return datos[posicion.getX()][posicion.getY()];
    }
}

