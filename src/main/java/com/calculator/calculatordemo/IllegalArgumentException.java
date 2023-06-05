package com.calculator.calculatordemo;

public class IllegalArgumentException extends RuntimeException{


    private static final String DEFAULT_MESSAGE = "На ноль делить нельзя";

    public IllegalArgumentException() {
        this(DEFAULT_MESSAGE);
    }

    public IllegalArgumentException(String message) {
        super(message);
    }
}
