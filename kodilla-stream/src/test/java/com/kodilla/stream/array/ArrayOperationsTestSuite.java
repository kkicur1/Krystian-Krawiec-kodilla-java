package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int numbers[]=new int[20];

        //when
        for(int i=0; i<20;i++ ) {
            numbers[i] = i;

        }

        //then
        double result= ArrayOperations.getAverage(numbers);
        assertEquals(9.5,result);
    }
}
