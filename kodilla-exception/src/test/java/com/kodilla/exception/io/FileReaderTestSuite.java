package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileReaderTestSuite {
    @Test
    void testReadFile() {
        //given
        FileReader fileReader= new FileReader();
        String fileName= "Nie ma takiego pliku txt.";
        //when&then

        assertDoesNotThrow(()-> fileReader.readFile(fileName));


    }

    @Test
    void whenFileDosentExistsReadFileShouldThrowException() {
        //given
        FileReader fileReader = new FileReader();
        String fileName= "Nie ma takiego pliku txt.";
        //when&then
        assertThrows(FileReaderException.class, ()->fileReader.readFile(fileName));
    }
}
