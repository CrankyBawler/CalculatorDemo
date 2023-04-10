package com.calculator.calculatordemo;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class CalculatorServise {
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }
    //public int summation (int num1, int num2);{
    //    return num1 + num2;
    }


