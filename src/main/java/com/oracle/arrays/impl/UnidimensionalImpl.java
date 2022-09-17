package com.oracle.arrays.impl;

import java.util.Arrays;

import com.oracle.arrays.Unidimensional;

public class UnidimensionalImpl implements Unidimensional {
    @Override
    public void ordenamiento(int[] arr) {
        Arrays.sort(arr);
    }

    @Override
    public int[] ordenamientoReversa(int[] arr) {
        Arrays.sort(arr);
        int[] arrcopy = new int[arr.length];
        
        int counter = 0;
        for(int i = arr.length-1; i >= 0 ;i--){
            arrcopy[counter] = arr[i];
            counter++;
        }

        return arrcopy;
    }
}

