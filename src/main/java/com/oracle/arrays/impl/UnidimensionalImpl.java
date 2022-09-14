package com.oracle.arrays.impl;

import com.oracle.arrays.Unidimensional;

public class UnidimensionalImpl implements Unidimensional {
    @Override
    public void ordenamiento(int[] arr) {
        int len = arr.length, temp;

        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    @Override
    public int[] ordenamientoReversa(int[] arr) {
        int len = arr.length, temp;

        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
