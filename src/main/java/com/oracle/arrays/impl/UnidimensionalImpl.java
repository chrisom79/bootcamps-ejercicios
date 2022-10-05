package com.oracle.arrays.impl;

import com.oracle.arrays.Unidimensional;

import java.util.Arrays;

public class UnidimensionalImpl implements Unidimensional {
    @Override
    public void ordenamiento(int[] arr) {
        Arrays.sort(arr);
    }

    @Override
    public int[] ordenamientoReversa(int[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            int j = i + 1;

            while (j < arr.length) {
                int key = arr[j-1];
                if (arr[j] > arr[j-1]) {
                    arr[j-1] = arr[j];
                    arr[j] = key;
                }
                j++;
            }

        }
        return arr;
    }
}
