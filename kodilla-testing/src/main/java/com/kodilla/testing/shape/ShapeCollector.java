package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public List<Shape> getShapes() {
        return shapes;
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }

    public String showFigures() {

        //przejsc petla po liscie ksztaltow
        //skleic nazwy ksztaltow w jeden String i go zwrocic

        String figures = "";
        for (Shape shapesFromList : shapes) {
            figures = figures+ shapesFromList.getShapeName();
        }
        return figures;
    }

}
