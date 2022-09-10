package com.oracle.arrays;

import com.oracle.arrays.model.Posicion;

public interface Multidimensional {
    Posicion getPosition(String[][] datos, String dato);
    String getData(String[][] datos, Posicion posicion);
}
