package com.demo.maven_demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberCheckTest {

    @Test
    void testEven() {
        NumberCheck n = new NumberCheck();
        assertEquals("Even", n.checkEvenOdd(4));
    }

    @Test
    void testOdd() {
        NumberCheck n = new NumberCheck();
        assertEquals("Odd", n.checkEvenOdd(5));
    }
}