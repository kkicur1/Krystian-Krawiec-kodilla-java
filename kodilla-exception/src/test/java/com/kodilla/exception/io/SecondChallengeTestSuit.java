package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuit {
    @Test
    void testProbablyIWillThrowException() {
        //given
        SecondChallenge secondChallenge= new SecondChallenge();
        //when&then
        assertAll(
                ()-> assertThrows(Exception.class, ()-> secondChallenge.probablyIWillThrowException(2,1)),
                ()-> assertThrows(Exception.class, ()-> secondChallenge.probablyIWillThrowException(0,1)),
                ()-> assertThrows(Exception.class, ()-> secondChallenge.probablyIWillThrowException(1.5,1.5)),
                ()-> assertThrows(Exception.class, ()-> secondChallenge.probablyIWillThrowException(0,1.5)),
                ()-> assertDoesNotThrow(()-> secondChallenge.probablyIWillThrowException(1.5,0))
        );
    }
}
