package com.kodilla.testing.shape;

public class Square implements Shape {
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return this.sideA * this.sideA;
    }
}
