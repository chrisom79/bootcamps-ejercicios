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
        return Arrays.stream(arr).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
