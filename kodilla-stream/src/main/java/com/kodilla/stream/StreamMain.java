package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

import static java.awt.SystemColor.text;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("This is beautified text in different options:");

        System.out.println(poemBeautifier.beautify("Krystian", text -> text + "ABC"));
        System.out.println(poemBeautifier.beautify("Piotr", text -> "ABC"+ text + "ABC"));
        System.out.println(poemBeautifier.beautify("Rambo", text -> "ABC"+ text));
        System.out.println(poemBeautifier.beautify("Krystian",String::toUpperCase));
        System.out.println(poemBeautifier.beautify("KRYSTIAN",String::toLowerCase));



        //7.2
        //System.out.println("Using Stream to generate even numbers from 1 to 20");
        //NumbersGenerator.generateEven(20);


    }
}