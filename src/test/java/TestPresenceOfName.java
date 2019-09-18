package test.java;

import main.java.PresenceOfName;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPresenceOfName {
    private static PresenceOfName _name;
    @BeforeClass
    public static void setup(){
        _name=new PresenceOfName();
    }
    @AfterClass
    public static void teardown(){
        _name=null;
    }
    @Test
    public void Test_PresenceOfAName_Using_RegularExpression(){

        assertEquals("finding the result in the given sentence",true ,_name.FindingPattern("This is Harry","harry"));
        assertEquals("finding the result in the given sentence",false,_name.FindingPattern("This is henry","harry"));
        assertTrue(_name.FindingPattern(" Is harrystyle a real gentleman?","Harry"));

    }
    @Test
    public void Test_PresenceOfAName_Using_RegularExpression_failure(){
        assertNotEquals("finding the result in the given sentence",true,_name.FindingPattern("Haary HHary carey","harry"));
        assertNotEquals("finding the result in the given sentence",false,_name.FindingPattern("@#$#%$%%^harry&^%&*&*","harry"));
    }
}
