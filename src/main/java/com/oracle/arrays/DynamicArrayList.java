package com.oracle.arrays;

public interface DynamicArrayList {
    void insert(int element);
    void remove(int index);
    int get(int index);
    void resize();
    void resize(int newSize);
    int length();
}
