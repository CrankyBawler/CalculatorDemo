package com.calculator.calculatordemo;

import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiсeParametersTest {
    CalculatorServiсe serviсe = new CalculatorServiсe();

    private static Collection<Arguments> parameters() {
        return List.of(
                Arguments.of(1, 2),
                Arguments.of(-1, 2),
                Arguments.of(1, -2),
                Arguments.of(-1, -2));
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testSum(int num1, int num2) {
        var actual = serviсe.sum(num1, num2);
        var expected = num1 + num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testMinus(int num1, int num2) {
        var actual = serviсe.minus(num1, num2);
        var expected = num1 - num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testMiltiply(int num1, int num2) {
        var actual = serviсe.multiply(num1, num2);
        var expected = num1 * num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testDivide(int num1, int num2) {
        var actual = serviсe.divide(num1, num2);
        var expected = num1 / num2;
        assertEquals(expected, actual);
    }
}