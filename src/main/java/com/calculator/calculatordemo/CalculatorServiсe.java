package com.calculator.calculatordemo;


import org.springframework.stereotype.Service;

@Service
public class CalculatorServiсe implements CalculatorInterface {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public int sum(int num1, int num2) {

        return num1 + num2;
    }


    public int minus(int num1, int num2) {

        return num1 - num2;
    }

    public int multiply(int num1, int num2) {

        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return num1 / num2;
    }


}




