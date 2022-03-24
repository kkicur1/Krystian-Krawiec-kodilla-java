package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        String fileName= "Nie ma takiego pliku txt.";
        try {
            fileReader.readFile(fileName);
        } catch (FileReaderException e) {
            System.out.println("problem while reading");
        }
    }
}
