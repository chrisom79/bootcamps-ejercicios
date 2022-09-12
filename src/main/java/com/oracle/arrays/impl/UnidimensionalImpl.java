package com.oracle.arrays.impl;

import com.oracle.arrays.Unidimensional;

public class UnidimensionalImpl implements Unidimensional {
    @Override
    public void ordenamiento(int[] arr) {
        //Existen diferentes algoritmos de ordanmiento pero para este ejercicio realice el mas sencillo

        int val;
        //System.out.println(arr.length);
        for (int i = 0;i < arr.length-2;i++){
            if (arr[i]>arr[i+1]){
                val = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = val;
            }
        }
        /*
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
        */
    }

    @Override
    public int[] ordenamientoReversa(int[] arr) {
        int[] reverse = new int[4];
        int j = arr.length - 1;
        //System.out.println("Empieza");
        for(int i = 0; i < arr.length ;i++){
            reverse[i] = arr[j];
            //System.out.println(reverse[i]);
            j--;
        }
        /*
        for(int i = 0; i< arr.length;i++){
            System.out.println(reverse[i]);
        }
        */
        return reverse;
    }
}
