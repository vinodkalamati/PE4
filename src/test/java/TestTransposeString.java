package test.java;

import main.java.TransposeString;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTransposeString {
    private static TransposeString _Transpose;

    @BeforeClass
    public static void setup(){
        _Transpose=new TransposeString();
    }
    @AfterClass
    public static void teardown(){
        _Transpose=null;
    }
    @Test
    public void Test_TransposeString_Reversing_Each_Word(){
        assertEquals("Expected String doesn't match with Actual String","a kciuq nworb xof spmuj revo eht yzal god",_Transpose.String_Transpose("a quick brown fox jumps over the lazy dog"));
        assertEquals("Expected String doesn't match with Actual String","tupnI : ehS slles sllehsaes yb eht erohsaes",_Transpose.String_Transpose("Input : She sells seashells by the seashore"));
    }

    @Test
    public void Test_TransposeString_Reversing_Each_Word_failure(){
        assertNull("Expected String doesn't match with Actual String",_Transpose.String_Transpose(""));
        assertNotEquals("Expected String doesn't match with Actual String"," expected",_Transpose.String_Transpose("detcepxE"));
    }
}
