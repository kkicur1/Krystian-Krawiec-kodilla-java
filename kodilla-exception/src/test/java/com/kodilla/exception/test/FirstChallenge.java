package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
/*/
 try {


 } catch (ArithmeticException e) {
 System.out.println("B&#x142;&#x105;d dzielenia przez zero" + e);
 } finally {
 System.out.println("Wprowad&#x17A; kolejne liczby");
 }


 }
 }

 /*/
