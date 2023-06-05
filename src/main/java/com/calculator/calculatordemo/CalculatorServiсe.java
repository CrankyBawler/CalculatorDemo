package com.calculator.calculatordemo;


import org.springframework.stereotype.Service;

@Service
public class CalculatorServiсe implements CalculatorInterface {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }


    public int minus(int num1, int num2) {
        int minus = num1 - num2;
        return minus;
    }

    public int multiply(int num1, int num2) {
        int multiply = num1 * num2;
        return multiply;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        } else {
            int divide = num1 / num2;
            return divide;
        }
    }
}




