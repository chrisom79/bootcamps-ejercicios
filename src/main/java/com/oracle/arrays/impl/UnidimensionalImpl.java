package com.oracle.arrays.impl;

import com.oracle.arrays.Unidimensional;
import com.oracle.arrays.model.Posicion;

public class UnidimensionalImpl implements Unidimensional {
    @Override
    public void ordenamiento(int[] arr) {
        Posicion pos = new Posicion(0, 0);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pos.setX(arr[i]);
                pos.setY(arr[i+1]);
                arr[i+1] = pos.getX();
                arr[i] = pos.getY();
                
            }
        }
        if(pos.getY() != 0){
            ordenamiento(arr);
        }
    }

    @Override
    public int[] ordenamientoReversa(int[] arr) {
        Posicion pos = new Posicion(0, 0);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                pos.setX(arr[i]);
                pos.setY(arr[i + 1]);
                arr[i] = pos.getY();
                arr[i+1] = pos.getX();                
            }
        }
        if(pos.getY() != 0){
            ordenamientoReversa(arr);
        }
        return arr;
    }
}
