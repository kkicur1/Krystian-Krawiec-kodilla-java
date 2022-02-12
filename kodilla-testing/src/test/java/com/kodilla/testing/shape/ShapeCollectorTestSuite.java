package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: ShapeCollector Test Suite ")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("Test of adding and removing figures from list")
    class AddingOrRemovingTest {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape shape = new Triangle(10.0, 5);
            shapeCollector.addFigure(shape);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapes().size());
        }
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape shape = new Triangle(10,5.0);
            shapeCollector.removeFigure(shape);

            //Then
            Assertions.assertEquals(0, shapeCollector.getShapes().size());
        }


    }
    @Nested
    @DisplayName("Test of getting or showing figures from list")
    class GettingShowingTest {

        @Test
        void testGetFigure (){
            //Given
            ShapeCollector shapeCollector= new ShapeCollector();

            //When
            Shape shape= new Circle(5.0);
            Shape shape1= new Triangle(10.0,5.0);
            shapeCollector.addFigure(shape);
            shapeCollector.addFigure(shape1);
            shapeCollector.getFigure(1);

            //Then
            Assertions.assertEquals(shape1, shapeCollector.getFigure(1));
        }

        @Test
        void testShowFigures(){
            //When
            ShapeCollector shapeCollector= new ShapeCollector();

            //Given
            Shape shape= new Square(10.0);
            shapeCollector.addFigure(shape);
            shapeCollector.addFigure(shape);
            shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("nullSquareSquare", shapeCollector.showFigures());
        }

    }
}
