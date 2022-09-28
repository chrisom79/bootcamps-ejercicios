package com.oracle.arrays;

import com.oracle.arrays.impl.DynamicArrayListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicArrayListTest {
    @Test
    public void insertGetSuccessTest() {
        DynamicArrayList arrayList = new DynamicArrayListImpl();
        arrayList.insert(1);
        arrayList.insert(2);
        arrayList.insert(3);
        arrayList.insert(4);
        arrayList.insert(5);

        assertEquals(3, arrayList.get(2));
        arrayList.insert(6);
        arrayList.insert(7);
        arrayList.insert(8);
        arrayList.insert(9);
        arrayList.insert(10);
        arrayList.insert(11);
        assertEquals(10, arrayList.get(9));
    }


    @Test
    public void insertRemoveGetSuccessTest() {
        DynamicArrayList arrayList = new DynamicArrayListImpl();
        arrayList.insert(1);
        arrayList.insert(2);
        arrayList.insert(3);
        arrayList.insert(4);
        arrayList.insert(5);
        arrayList.remove(4);

        assertEquals(5, arrayList.get(4));
        assertEquals(4, arrayList.length());

        arrayList.insert(6);
        arrayList.insert(7);
        arrayList.insert(8);
        arrayList.insert(9);
        arrayList.insert(10);
        arrayList.insert(11);

        assertEquals(10, arrayList.length());

    }
}
