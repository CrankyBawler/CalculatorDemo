package com.calculator.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorInterface calculatorService;

    public CalculatorController(CalculatorInterface calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String sum(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 + "+" + num2 + "=" + calculatorService.sum(num1, num2);
        } else {
            return "Ошибка! введите оба числа";
        }
    }

    @GetMapping(path = "/minus")
    public String minus(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 + "-" + num2 + "=" + calculatorService.minus(num1, num2);
        } else {
            return "Ошибка! введите оба числа";
        }
    }

    @GetMapping(path = "/multiply")
    public String multiply(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 + "*" + num2 + "=" + calculatorService.multiply(num1, num2);
        } else {
            return "Ошибка! введите оба числа";
        }
    }

    @GetMapping(path = "/divide")
    public String divide(int num1, int num2) {
        return num1 + "/" + num2 + "=" + calculatorService.divide(num1, num2);
            }
        }


