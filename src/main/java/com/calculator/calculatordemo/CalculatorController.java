package com.calculator.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorServise calculatorServise;

    public CalculatorController (CalculatorServise calculatorServise){
        this.calculatorServise = calculatorServise;
    }
    @GetMapping
    public String hello(){
        return calculatorServise.hello();
    }
    @GetMapping(path = "/plus")
    public String sum (int num1, int num2){
        int sum = num1 + num2;
        System.out.print(num1 + " + " + num2 + " = ");
        return num1 + " + " + num2 + " = " + sum;
    }

}
