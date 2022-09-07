package com.oracle.arrays.impl;

import com.oracle.arrays.Unidimensional;

import java.util.Arrays;
import java.util.Collections;

public class UnidimensionalImpl implements Unidimensional {
    @Override
    public void ordenamiento(int[] arr) {
        Arrays.sort(arr);
    }

    @Override
    public int[] ordenamientoReversa(int[] arr) {
        int[] arrRev = arr.clone();

        Arrays.sort(arrRev);

        int arrLength = arr.length;

        for (int i = 0; i < arrLength / 2; i++) {
            int temp = arrRev[i];
            int j = arrLength - i - 1;

            arrRev[i] = arrRev[j];
            arrRev[j] = temp;
        }

        return arrRev;
    }
}
