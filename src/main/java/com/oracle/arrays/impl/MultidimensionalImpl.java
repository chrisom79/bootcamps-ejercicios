package com.oracle.arrays.impl;

import com.oracle.arrays.Multidimensional;
import com.oracle.arrays.model.Posicion;

public class MultidimensionalImpl implements Multidimensional {
    @Override
    public Posicion getPosition(String[][] datos, String dato) {
        Posicion pos = new Posicion(0, 0);
        for(int i = 0; i < datos.length; i++){
            for(int j = 0; j < datos[0].length;j++){
                if(datos[i][j].equals(dato)){
                    pos.setX(i);
                    pos.setY(j);
                }
            }
        }
        if(datos.length == 0){
            return null;
        }else{
            return pos;
        }
        
    }

    @Override
    public String getData(String[][] datos, Posicion posicion) {
        int x = posicion.getX();
        int y = posicion.getY();

        return datos[x][y];
    }
}
