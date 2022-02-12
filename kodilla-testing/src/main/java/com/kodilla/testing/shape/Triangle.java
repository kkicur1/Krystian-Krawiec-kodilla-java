package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double sideA;
    private double sideH;

    public Triangle(double sideA, double sideH) {
        this.sideA = sideA;
        this.sideH = sideH;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return 1/2*this.sideA*this.sideH;
    }
}
