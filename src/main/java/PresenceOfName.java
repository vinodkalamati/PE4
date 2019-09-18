package main.java;



public class PresenceOfName {

    public boolean FindingPattern(String _Sentence,String _Word){

        _Sentence=_Sentence.toLowerCase();
        _Word=_Word.toLowerCase();
        return _Sentence.contains(_Word);
    }
}
