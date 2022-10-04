package com.oracle.arrays.impl;

import com.oracle.arrays.DynamicArrayList;

public class DynamicArrayListImpl implements DynamicArrayList {
    private int size = 10;
    private int idx = 0;
    private int[] arr = new int[size];

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public void insert(int element) {
        if (idx == (int) (size * .70)) {
            resize();            
        }
        arr[idx] = element;
        idx++;
    }

    @Override
    public void remove(int index) {        
        arr[idx + 1] = 0;
        for (int i = index+1; i < idx; i++) {
            arr[i] = arr[i+1];
        }
        idx--;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public void resize() {
        size = (int) (size * .40) + size;
        int temp[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;       
    }

    @Override
    public void resize(int newSize) {
        size = newSize;
        int temp[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    @Override
    public int length() {
        return idx;
    }
}
