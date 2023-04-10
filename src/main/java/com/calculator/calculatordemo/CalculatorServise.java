package com.calculator.calculatordemo;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class CalculatorServise implements CalculatorInterface {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String sum(int num1, int num2) {
        if (num1 != 0 && num2 !=0) {
            int sum = num1 + num2;
            return num1 + " + " + num2 + " = " + sum;
        } else {
            return "Ошибка! введите оба числа";
        }
    }


    public String minus(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
            int minus = num1 - num2;
            return num1 + " - " + num2 + " = " + minus;
        } else {
            return "Ошибка! введите оба числа";
        }
    }
    public String multiply(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
        int multiply = num1 * num2;
        return num1 + " * " + num2 + " = " + multiply;
        } else {
            return "Ошибка! введите оба числа";
        }
    }
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return " На 0 делить нельзя ";
        } else {
            if (num1 != 0 && num2 != 0) {
                int divide = num1 / num2;
                return num1 + " / " + num2 + " = " + divide;
            } else {
                return "Ошибка! введите оба числа";
            }
        }
    }
}


