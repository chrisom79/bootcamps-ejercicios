package com.oracle.arrays.impl;

import com.oracle.arrays.Unidimensional;

public class UnidimensionalImpl implements Unidimensional {
    @Override
    public void ordenamiento(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]> arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
    }

    @Override
    public int[] ordenamientoReversa(int[] arr) {
         for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]< arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
         int cpyArr [] = new int[arr.length];
         for(int i = 0; i<arr.length; i++){
             cpyArr[i]= arr[i];
         }
        return cpyArr;
    }
}
