package com.demo.maven_demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SumTest {

    @Test
    void testAddPositiveNumbers() {
        Sum s = new Sum();
        assertEquals(5, s.add(2, 3));
    }

    @Test
    void testAddNegativeNumbers() {
        Sum s = new Sum();
        assertEquals(-5, s.add(-2, -3));
    }

    @Test
    void testAddWithZero() {
        Sum s = new Sum();
        assertEquals(7, s.add(7, 0));
    }

    @Test
    void testAddMixedNumbers() {
        Sum s = new Sum();
        assertEquals(1, s.add(3, -2));
    }
}