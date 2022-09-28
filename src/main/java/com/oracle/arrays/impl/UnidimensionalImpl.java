package com.oracle.arrays.impl;

import com.oracle.arrays.Unidimensional;

public class UnidimensionalImpl implements Unidimensional {
    @Override
    public void ordenamiento(int[] arr) {
        int aux;
        for (int i=0; i< arr.length-1; i++){
            for (int j=0; j<arr.length-1; j++){
                if (arr[j]>arr[j+1]){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }

    @Override
    public int[] ordenamientoReversa(int[] arr) {
        int arrInvertido[] = arr;
        int aux;
        for (int i=0; i<arrInvertido.length/2; i++){
            aux = arrInvertido[i];
            arrInvertido[i] = arrInvertido[arrInvertido.length - 1 - i];
            arrInvertido[arrInvertido.length - 1 - i] = aux;
        }
        return arrInvertido;
    }
}
