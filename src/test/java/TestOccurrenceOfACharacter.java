package test.java;

import main.java.OccurrenceOfACharacter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class TestOccurrenceOfACharacter {

    private static OccurrenceOfACharacter _Frequency = new OccurrenceOfACharacter();

    @BeforeClass
    public static void setup() {
        _Frequency = new OccurrenceOfACharacter();
    }

    @AfterClass
    public static void teardown() {
        _Frequency = null;
    }

    @Test
    public void TestOccurrenceOfACharacter() {
        assertEquals("OccurrenceOfACharacter():The Occurrence of a character in the given String doesn't match with the result", 10, _Frequency.OccurrenceOfAChar("Java is java again java again", 'a'));
        assertEquals("OccurrenceOfACharacter():The Occurrence of a character in the given String doesn't match with the result",2,_Frequency.OccurrenceOfAChar("Java is java again java again",'j'));
        assertEquals("OccurrenceOfACharacter():The Occurrence of a character in the given String doesn't match with the result",0,_Frequency.OccurrenceOfAChar("AAAAA",'a'));
    }

    @Test
    public void TestOccurrenceOfACharacter_Failure(){
        assertNotEquals("OccurrenceOfACharacter():The Occurrence of a character in the given String doesn't match with the result",5,_Frequency.OccurrenceOfAChar("AAAAA",'a'));
        assertNotEquals("OccurrenceOfACharacter():The Occurrence of a character in the given String doesn't match with the result",4,_Frequency.OccurrenceOfAChar("@@@ $$$ asdf",' '));
    }


}