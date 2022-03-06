package com.kodilla.stream.lambda;

public class StreamMain {

    public static void main(String[] args) {
        Processor processor = new Processor();                                // [6]
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();  // [7]
        processor.execute(executeSaySomething);
    }
}
