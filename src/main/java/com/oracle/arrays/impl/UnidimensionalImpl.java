package com.oracle.arrays.impl;

import com.oracle.arrays.Unidimensional;

public class UnidimensionalImpl implements Unidimensional {
    @Override
    public void ordenamiento(int[] arr) {
        boolean flag=false;
        while(!flag){
            flag=true;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int a=arr[i];
                    int b=arr[i+1];
                    arr[i+1]=a;
                    arr[i]=b;
                    flag=false;
                }
            }
        }
    }

    @Override
    public int[] ordenamientoReversa(int[] arr) {
        boolean flag=false;
        while(!flag){
            flag=true;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                    int a=arr[i];
                    int b=arr[i+1];
                    arr[i+1]=a;
                    arr[i]=b;
                    flag=false;
                }
            }
        }
        return arr;
    }
}
