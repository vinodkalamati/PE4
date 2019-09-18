package main.java;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfACharacter {


public int OccurrenceOfAChar(String _Sentence,Character _Character){
    System.out.println(_Sentence);
    int _length=_Sentence.length();
    String _Sentence2=_Sentence.replaceAll(String.valueOf(_Character),"");
    int _length2=_Sentence2.length();
    return (_length-_length2);
}
}
