package com.oracle.arrays.impl;

import com.oracle.arrays.Unidimensional;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class UnidimensionalImpl implements Unidimensional {
    @Override
    public void ordenamiento(int[] arr) {
        Arrays.sort(arr);
    }

    @Override
    public int[] ordenamientoReversa(int[] arr) {
        Integer[] tmp = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
        Arrays.sort(tmp,Comparator.reverseOrder());
        int [] new_arr = new int [tmp.length];
        for(int ctr = 0; ctr < tmp.length; ctr++) {
            new_arr[ctr] = tmp[ctr].intValue(); // returns int value
        }
        return new_arr;
    }
}
