package test.java;

import main.java.ReplacingACharacter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestReplacingACharacter {
private static ReplacingACharacter _Replace;

@BeforeClass
    public static void setup(){
    _Replace=new ReplacingACharacter();
}
@AfterClass
    public static void teardown(){
    _Replace=null;
}

@Test
    public void TestReplacing_d_f_l_t(){

    assertEquals("Replacing Character_d with Character_f and Character_l with Character_t","fairy tong",_Replace.Replacing_d_l("dairy long"));
    assertEquals("Replacing Character_d with Character_f and Character_l with Character_t","@ffhh ctean tot",_Replace.Replacing_d_l("@ddhh clean lol"));
}

@Test
    public void TestReplacing_d_f_l_t_failure(){
    assertNotEquals("Replacing Character_d with Character_f and Character_l with Character_t","foreverf",_Replace.Replacing_d_l("foreverD"));
    assertNotEquals("Replacing Character_d with Character_f and Character_l with Character_t","Tassi,tassi,Fog,fog",_Replace.Replacing_d_l("Lassi,lassi,Dog,dog"));
}

}
