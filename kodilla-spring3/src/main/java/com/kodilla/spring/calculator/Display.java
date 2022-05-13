package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public final class Display {

    private double val;

    public void displayValue(double val) {
        this.val=val;
        System.out.println(val);
    }

}
