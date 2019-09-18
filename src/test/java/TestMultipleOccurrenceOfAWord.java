package test.java;

import main.java.MultipleOccurencesOfAWord;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMultipleOccurrenceOfAWord {
    private static MultipleOccurencesOfAWord _word;

    @BeforeClass
    public static void setup(){
        _word=new MultipleOccurencesOfAWord();

    }
    @AfterClass
    public static void teardown(){
        _word=null;
    }
    @Test
    public void Test_OccurrenceOfAWord_Using_Matcher_returnString(){
        assertEquals("Finding the multiple occurrences of a word:actual String doesn't match with the expected String","Found at:4 - 6 Found at:10 - 12 Found at:27 - 29",_word.MultipleOccurrencesOfAWord("She sells seashells by the seashore","se"));
        assertEquals("Finding the multiple occurrences of a word:actual String doesn't match with the expected String","Found at:4 - 6 Found at:12 - 14 Found at:29 - 31",_word.MultipleOccurrencesOfAWord("She sells   seashells by the seashore","se"));
    }

    @Test
    public void Test_OccurrenceOfAWord_Using_Matcher_returnString_failure(){
        assertNotEquals("Finding the multiple occurrences of a word:actual String doesn't match with the expected String","Found at:4 - 6 Found at:10 - 12 Found at:27 - 29",_word.MultipleOccurrencesOfAWord("she Sells Seasells by the SeaShore","se"));
        assertNull("Finding the multiple occurrences of a word:actual String doesn't match with the expected String",_word.MultipleOccurrencesOfAWord("",""));
        assertNull("Finding the multiple occurrences of a word:actual String doesn't match with the expected String",_word.MultipleOccurrencesOfAWord("She sells   seashells by the seashore",""));



    }

}
