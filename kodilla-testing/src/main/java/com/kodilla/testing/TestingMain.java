package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(7,3);
        int sum = calculator.add();
        int substraction = calculator.substract();


        if (sum==10) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (substraction==4) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");
    }
}
