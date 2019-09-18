package main.java;


import java.util.Arrays;

public class TransposeString {

    public String String_Transpose(String _Sentence){
        int i=0;
        if(_Sentence.length()<1){
            return null;
        }
        String[] str= _Sentence.split(" ");
        String _result = "";

        for(String words:str){
            StringBuffer _words=new StringBuffer(words);
            str[i]= String.valueOf(_words.reverse());
            System.out.print(str[i]+" ");
            _result =_result+str[i]+" ";
            i++;
        }
//        String _transposedString= Arrays.toString(str);
        return _result.trim();

    }
}
