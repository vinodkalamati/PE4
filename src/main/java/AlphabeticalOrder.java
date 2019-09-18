package main.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlphabeticalOrder {

    public List<String> Words_In_AlphabeticalOrder(String _paragraph){
        List<String> Words= Arrays.asList(_paragraph.split(" "));
        Collections.sort(Words);
        for(String a:Words){
            System.out.println(a);
        }
        System.out.println(Words.size());

        if(Words.isEmpty()){
            return null;
        }
        return Words;
    }
}
