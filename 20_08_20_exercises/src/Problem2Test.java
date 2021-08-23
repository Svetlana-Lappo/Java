import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    Problem2 problem2;

    @BeforeEach
    public void init(){
        problem2 = new Problem2();
    }

    @Test
    public void testSolve_symbAndUppercaseLetters_symbAndLowercaseLetters(){
        String res= problem2.solve("&FF!FF");
        assertEquals("&ff!ff", res);
    }
    @Test
    public void testSolve_symbAndLowercaseLetters_symbAndUpperCaseLetters(){
        String res= problem2.solve("hello !");
        assertEquals("HELLO !", res);
    }
    @Test
    public void testSolve_symbAndLowerAndUpperCaseLetters_symbAndUpperAndLowerCaseLetters(){
        String res= problem2.solve("Hello World!");
        assertEquals("hELLO wORLD!", res);
    }

}