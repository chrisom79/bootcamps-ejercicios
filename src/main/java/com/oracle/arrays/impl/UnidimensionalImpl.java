package com.oracle.arrays.impl;

import com.oracle.arrays.Unidimensional;

public class UnidimensionalImpl implements Unidimensional {
    @Override
    public void ordenamiento(int[] arr) {
        for (int j = 0; j < arr.length; j++){
            for (int i = 0; i < arr.length - 1; i++){
                if( arr[i] > arr[i + 1]) {
                    int aux = arr[i+1];
                    arr[i + 1] = arr[i];
                    arr[i] = aux;
                }
            }
        }
    }

    @Override
    public int[] ordenamientoReversa(int[] arr) {
        for (int j = 0; j < arr.length; j++){
            for (int i = 0; i < arr.length - 1; i++){
                if( arr[i] < arr[i + 1]) {
                    int aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                }
            }
        }
        return arr;
    }
}
