package com.oracle.arrays.impl;

import com.oracle.arrays.Multidimensional;
import com.oracle.arrays.model.Posicion;

public class MultidimensionalImpl implements Multidimensional {
   Posicion position;

    @Override
    public Posicion getPosition(String[][] datos, String dato) {
        position = new Posicion(0, 0);
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                if (datos[i][j].equals(dato)) {
                    position.setX(i);
                    position.setY(j);
                    return position;
                }
            }
        }
        return null;
    }

    @Override
    public String getData(String[][] datos, Posicion posicion) {
        String data;
        data = datos[posicion.getX()][posicion.getY()];
        return data;
    }

}
