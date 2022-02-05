package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when you put empty list to method exterminate "+ "then it should return empty list")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator=new OddNumbersExterminator();
        //When
        List<Integer> result= oddNumbersExterminator.exterminate(new ArrayList<>());
        System.out.println("testing"+result);
        //Then
        Assertions.assertTrue(result.isEmpty());
    }

    @DisplayName("when you put list to method exterminate with odd and even numbers"+ "then it should return list with even numbers")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator=new OddNumbersExterminator();

        List<Integer> result = oddNumbersExterminator.exterminate(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("testing"+result);
        //Then
        Assertions.assertEquals(Arrays.asList(2,4,6), result);
    }
}
