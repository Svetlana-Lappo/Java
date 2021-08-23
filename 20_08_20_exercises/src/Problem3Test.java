import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {
    Problem3 problem3;

    @BeforeEach
    public void init(){
        problem3 = new Problem3();
    }
    @Test
    public void testSolve_TwoSameNumbers_GCDIsSameNumber(){
        int GCD=problem3.solve(2,2);
        assertEquals(2,GCD);
    }
    @Test
    public void testSolve_OneANDAnotherNumber_GCDIsOne(){
        int GCD=problem3.solve(1,5);
        assertEquals(1,GCD);
    }
    @Test
    public void testSolve_TwoDifferentNumbers_GCD(){
        int GCD=problem3.solve(34,56);
        assertEquals(2,GCD);
    }

}