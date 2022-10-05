package com.oracle.arrays.impl;

import com.oracle.arrays.DynamicArrayList;

import java.util.Arrays;

public class DynamicArrayListImpl implements DynamicArrayList {
    private int size = 10;
    private int[] arr = new int[size];
    private int idx = 0;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public void insert(int element) {
        if(idx >= size) {
            resize();
        }

        arr[idx] = element;
        idx++;
    }

    @Override
    public void remove(int index) {
        int[] newArr = new int[size];
        int j = 0;

        for (int i = 0; i < size; i++) {
            if(i != index) {
                newArr[j] = arr[i];
                j++;
            }

        }
        arr = newArr;
        idx--;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public void resize() {
        arr = Arrays.copyOf(arr, size*2);
    }

    @Override
    public void resize(int newSize) {
        arr = Arrays.copyOf(arr, newSize);
    }

    @Override
    public int length() {
        return idx;
    }
}
