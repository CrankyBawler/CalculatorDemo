package com.calculator.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorInterface calculatorServise;

    public CalculatorController(CalculatorInterface calculatorServise) {
        this.calculatorServise = calculatorServise;
    }

    @GetMapping
    public String hello() {
        return calculatorServise.hello();
    }

    @GetMapping(path = "/plus")
    public String sum(int num1, int num2) {
        return calculatorServise.sum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(int num1, int num2) {
        return calculatorServise.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(int num1, int num2) {
        return calculatorServise.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(int num1, int num2) {
        return calculatorServise.divide(num1, num2);
    }
}
