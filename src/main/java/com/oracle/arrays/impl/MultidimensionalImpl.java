package com.oracle.arrays.impl;

import com.oracle.arrays.Multidimensional;
import com.oracle.arrays.model.Posicion;

public class MultidimensionalImpl implements Multidimensional {
    @Override
    public Posicion getPosition(String[][] datos, String dato) {
        int x, y;
        Posicion pos = null;
        for(x=0; x< datos.length; x++) {
            for (y=0; y<datos[x].length; y++) {
                if (datos[x][y].equals(dato)) pos = new Posicion(x, y);
            }
        }
        return pos;
    }

    @Override
    public String getData(String[][] datos, Posicion posicion) {
        return datos[posicion.getX()][posicion.getY()];
    }
}
