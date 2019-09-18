package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurencesOfAWord {

    public String MultipleOccurrencesOfAWord(String _Sentence,String Pattern_String){
        if(Pattern_String.length()<=1||_Sentence.length()<=1){
            return null;
        }
        Pattern _pattern=Pattern.compile(Pattern_String);
        Matcher _matcher=_pattern.matcher(_Sentence);
        String str="";
        while (_matcher.find()){
            System.out.println("Found at:"+_matcher.start()+" - "+_matcher.end());
            str=str+"Found at:"+_matcher.start()+" - "+_matcher.end()+" ";
        }
        System.out.println(str);
        return str.trim();

    }
}
