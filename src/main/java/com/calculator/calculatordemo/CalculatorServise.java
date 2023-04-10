package com.calculator.calculatordemo;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class CalculatorServise {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String sum(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;

    }
    public String minus(int num1, int num2) {
        int minus = num1 - num2;
        return num1 + " - " + num2 + " = " + minus;
    }
    public String multiply(int num1, int num2) {
        int multiply = num1 * num2;
        return num1 + " * " + num2 + " = " + multiply;
    }
    public String divide(int num1, int num2) {
        int divide = num1 / num2;
        return num1 + " / " + num2 + " = " + divide;
    }

}


