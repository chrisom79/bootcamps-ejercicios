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
         if (arr == null || index < 0 || index > arr.length) {
            System.out.println("Invalid array or index.");
        } else {
            if (index == arr.length) {
                temp = new int[arr.length - 1];
            } else {
                arr[index] = arr[arr.length - 1];
                temp = new int[arr.length - 1];
            }
            for (int i = 0; i < arr.length-1; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
            current--;
        }
    }

    @Override
    public void get(int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            System.out.println("Index out of bound");
            
        }else {
            System.out.printf("Element in index %d is: %d",index,arr[index]);
        }
    }

    @Override
    public void resize() {
        capacity = arr.length + 2;
        temp = new int[capacity];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }
}
