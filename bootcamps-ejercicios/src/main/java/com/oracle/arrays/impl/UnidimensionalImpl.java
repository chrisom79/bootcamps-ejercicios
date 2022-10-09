package com.oracle.arrays.impl;

import com.oracle.arrays.Unidimensional;

public class UnidimensionalImpl implements Unidimensional {

    @Override
    public void ordenamiento(int[] arr) {

        quickSort(arr, 0, arr.length - 1, true);

    }

    @Override
    public int[] ordenamientoReversa(int[] arr) {

        int cpyArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            cpyArr[i] = arr[i];
        }

        quickSort(cpyArr, 0, cpyArr.length - 1, false);
        return cpyArr;

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high, boolean direction)//true ascendent, false descendent
    {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (direction == true) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            } else if (direction == false) {
                if (arr[j] > pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high, boolean direction) {
        if (low < high) {

            int pi = partition(arr, low, high, direction);

            quickSort(arr, low, pi - 1, direction);
            quickSort(arr, pi + 1, high, direction);
        }
    }
}
