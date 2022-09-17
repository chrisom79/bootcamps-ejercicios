package com.oracle.arrays.impl;

import com.oracle.arrays.DynamicArrayList;

/**
 *
 * @author Adolfo Carrillo
 */
public class DinamicArrayListImpl implements DynamicArrayList {

    private int arr[];

    private int capacity;
    private int current;

    public DinamicArrayListImpl() {
        
        arr = new int[1];
        capacity = 1;
        current = 0;
    }

    @Override
    public void insert(int element) {
        
        if (current == capacity) {
            resize();
        }
        arr[current] = element;
        current++;
    }

    @Override
    public void remove(int index) {
        
    }

    @Override
    public void get(int index) {

    }

    @Override
    public void resize() {
        int temp[] = new int[2 * capacity];

        for (int i = 0; i < capacity; i++) {
            temp[i] = arr[i];
        }
        capacity *= 2;
        arr = temp;
    }
}
