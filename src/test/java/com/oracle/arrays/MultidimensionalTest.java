package com.oracle.arrays;

import com.oracle.arrays.impl.MultidimensionalImpl;
import com.oracle.arrays.model.Posicion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MultidimensionalTest {
    Multidimensional multidimensional;
    @BeforeEach
    public void setup() {
        multidimensional = new MultidimensionalImpl();
    }
    @Test
    public void getPositionTest() {
        String[][] datos = {{"hola", "bootcamp", "java"}, {"este", "array", "multidimensional"}};

        Posicion pos = multidimensional.getPosition(datos, "multidimensional");
        assertEquals(pos.getX(), 1);
        assertEquals(pos.getY(), 2);

        pos = multidimensional.getPosition(datos, "test");
        assertNull(pos);

        datos = new String[][]{{}, {}};
        pos = multidimensional.getPosition(datos, "multidimensional");
        assertNull(pos);
    }

    @Test
    public void getDataTest() {
        String[][] datos = {{"ahora", "este", "es", "otro"}, {"pero", "irregular"}, {"java", "chido"}};
        Posicion pos = new Posicion(2, 0);
        String dato = multidimensional.getData(datos, pos);
        assertEquals(dato, "java");
    }
}
