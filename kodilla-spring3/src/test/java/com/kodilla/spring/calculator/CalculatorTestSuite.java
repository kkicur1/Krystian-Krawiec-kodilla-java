package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {

        //Given
        //When
        double resultAdd=calculator.add(10,5);
        double resultSub=calculator.sub(10,5);
        double resultMul=calculator.mul(10,5);
        double resultDiv=calculator.div(10,5);

        //Then
        assertEquals(15,resultAdd);
        assertEquals(5,resultSub);
        assertEquals(50,resultMul);
        assertEquals(2,resultDiv);
    }
}
