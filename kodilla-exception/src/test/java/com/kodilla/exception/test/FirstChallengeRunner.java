package com.kodilla.exception.test;

public class FirstChallengeRunner {
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("błąd dzielenia przez zero" +" "+ e);
        } finally {
            System.out.println("Wprowadź kolejne liczby");
        }
    }
}

