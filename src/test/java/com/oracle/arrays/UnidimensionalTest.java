package com.oracle.arrays;

import com.oracle.arrays.impl.UnidimensionalImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnidimensionalTest {
    @Test
    public void ordenamientoTest() {
        int[] arr = {5,2,8,9};

        Unidimensional uni = new UnidimensionalImpl();
        //Ascendente
        uni.ordenamiento(arr);
        assertEquals(2, arr[0]);
        assertEquals(9, arr[arr.length - 1]);

        //Descendente
        arr = uni.ordenamientoReversa(arr);
        assertEquals(9, arr[0]);
        assertEquals(2, arr[arr.length - 1]);
    }
}
