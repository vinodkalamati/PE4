package test.java;

import main.java.AlphabeticalOrder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TestAlphabeticalOrder {
    private static AlphabeticalOrder _Lexographical;
    @BeforeClass
    public  static void setup(){
        _Lexographical=new AlphabeticalOrder();
    }
    @AfterClass
    public static void teardown(){
        _Lexographical=null;
    }
    @Test
    public void Test_AlphabeticalOrder(){

        List<String> Actual= Arrays.asList(new String[]{"Alex", "Bobby", "Christine", "Don"});
    assertEquals("Words Extracted from the sentence should be in Alphabetical order:Expected Array is matching With Actual Array",Actual,_Lexographical.Words_In_AlphabeticalOrder("Don Christine Alex Bobby"));
        List<String> _Lexo=Arrays.asList(new String[] {"Extract", "alphabetical", "and", "from", "into","order.", "sort", "text","the","the", "them", "words"});
    assertEquals("Words Extracted from the sentence should be in Alphabetical order:Expected Array is matching With Actual Array",_Lexo,_Lexographical.Words_In_AlphabeticalOrder("Extract the words from the text and sort them into alphabetical order."));

    }
    @Test
    public void Test_AlphabeticalOrder_Failure(){

        List<String> _text=Arrays.asList(new String[]{"immersive","java","training"});
        assertNotEquals("Words Extracted from the sentence should be in Alphabetical order:Expected Array is matching With Actual Array",_text,_Lexographical.Words_In_AlphabeticalOrder("java % immersive % training"));
        assertNull("expected null if the list is empty",_Lexographical.Words_In_AlphabeticalOrder(" "));
    }
}
