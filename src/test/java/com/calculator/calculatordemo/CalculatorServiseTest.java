package com.calculator.calculatordemo;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiseTest {
    CalculatorServiсe serviсe = new CalculatorServiсe();

    @Test
    void testSum() {
        var result = serviсe.sum(1, 2);
        assertEquals(3, result);

        var result2 = serviсe.sum(-1, -2);
        assertEquals(-3, result2);

        var result3 = serviсe.sum(-1, 2);
        assertEquals(1, result3);

        var result4 = serviсe.sum(1, -2);
        assertEquals(-1, result4);

        var result5 = serviсe.sum(0, 2);
        assertEquals(2, result5);

        var result6 = serviсe.sum(1, 0);
        assertEquals(1, result6);
    }

    @Test
    void testMinus() {
        var result = serviсe.minus(1, 2);
        assertEquals(-1, result);

        var result2 = serviсe.minus(-1, -2);
        assertEquals(1, result2);

        var result3 = serviсe.minus(-1, 2);
        assertEquals(-3, result3);

        var result4 = serviсe.minus(1, -2);
        assertEquals(3, result4);

        var result5 = serviсe.minus(0, 2);
        assertEquals(-2, result5);

        var result6 = serviсe.minus(1, 0);
        assertEquals(1, result6);
    }

    @Test
    void testMultiply() {
        var result = serviсe.multiply(1, 2);
        assertEquals(2, result);

        var result2 = serviсe.multiply(-1, -2);
        assertEquals(2, result2);

        var result3 = serviсe.multiply(-1, 2);
        assertEquals(-2, result3);

        var result4 = serviсe.multiply(1, -2);
        assertEquals(-2, result4);

        var result5 = serviсe.multiply(0, 2);
        assertEquals(0, result5);

        var result6 = serviсe.multiply(1, 0);
        assertEquals(0, result6);

    }

    @Test
    void testDivide() {
        var result = serviсe.multiply(2, 1);
        assertEquals(2, result);

        var result2 = serviсe.multiply(-2, -1);
        assertEquals(2, result2);

        var result3 = serviсe.multiply(-2, 1);
        assertEquals(-2, result3);

        var result4 = serviсe.multiply(2, -1);
        assertEquals(-2, result4);

        var result5 = serviсe.multiply(0, 2);
        assertEquals(0, result5);

        assertThrows(IllegalArgumentException.class, () -> serviсe.divide(1, 0));

        try {
            serviсe.divide(1, 0);
            fail();
        } catch (IllegalArgumentException ignored) {

        }
    }


}
