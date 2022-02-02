package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        Integer temporaryValue=0;
        List<Integer>evenNumbers=new ArrayList<>();
        for(int n=0; n<numbers.size(); n++) {
            temporaryValue= numbers.get(n);
            if (temporaryValue % 2==0) {
                evenNumbers.add(temporaryValue);
            }
        }
        return evenNumbers;

        //List<Integer>evenNumbers=new ArrayList<>();
        //for (Integer evenNumber:numbers) {
            //if (evenNumber%2==0) {
                //evenNumbers.add(evenNumber);

            //}
        //}
        //return evenNumbers;

    }
}
