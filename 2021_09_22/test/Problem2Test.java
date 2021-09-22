import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    Problem2 problem2;

    @BeforeEach
    public void init(){
        problem2 = new Problem2();
    }

    @Test
    public void findMostOftenElementTest(){
        List<Integer> elements = Arrays.asList(-8,5,2,5,0);
        assertTrue(problem2.findMostOftenElement(elements).contains(5));
        assertTrue(problem2.findMostOftenElement(elements).size()==1);

    }


    @Test
    public void findMostOftenElementTest1(){
        List<Integer> elements = Arrays.asList(-20,5,2,2,0,4,5,2,4);
        assertTrue(problem2.findMostOftenElement(elements).contains(2));
        assertTrue(problem2.findMostOftenElement(elements).size()==1);

    }

    @Test
    public void findMostOftenElementTest2(){
        List<Integer> elements = Arrays.asList(4,2,2,0,4,5,2,4);
        assertTrue(problem2.findMostOftenElement(elements).contains(2));
        assertTrue(problem2.findMostOftenElement(elements).contains(4));
        assertTrue(problem2.findMostOftenElement(elements).size()==2);

    }
    @Test
    public void findMostOftenElementTest3(){
        List<Integer> elements = Arrays.asList(0,11,-1,-2);
        assertTrue(problem2.findMostOftenElement(elements).contains(0));
        assertTrue(problem2.findMostOftenElement(elements).contains(11));
        assertTrue(problem2.findMostOftenElement(elements).contains(-1));
        assertTrue(problem2.findMostOftenElement(elements).contains(-2));
        assertTrue(problem2.findMostOftenElement(elements).size()==4);

    }

}