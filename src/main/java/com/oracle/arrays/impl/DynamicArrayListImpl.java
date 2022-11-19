package com.oracle.arrays.impl;

import com.oracle.arrays.DynamicArrayList;

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
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index + 1,
                newArr, index, arr.length - index - 1);
        arr = newArr;
        idx--;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public void resize() {
        if (arr.length == size) {
            size = size * 2;
            int[] newArr = new int[size];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
    }

    @Override
    public void resize(int newSize) {
        if (arr.length <= newSize) {
            size = newSize;
            int[] newArr = new int[size];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
    }

    @Override
    public int length() {
        return idx;
    }
}
