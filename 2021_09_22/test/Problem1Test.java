import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    Problem1 problem1;


    @BeforeEach
    public void init(){
        problem1 = new Problem1();
    }

    @Test
   public void findElementMeetsMinTwiceTest(){
        List<Integer> elements = Arrays.asList(2,5,2,5,0);
        assertTrue(problem1.findElementMeetsMinTwice(elements).contains(2));
        assertTrue(problem1.findElementMeetsMinTwice(elements).contains(5));
        assertTrue(problem1.findElementMeetsMinTwice(elements).size()==2);

    }
    @Test
    public void findElementMeetsMinTwiceTest1(){
        List<Integer> elements = Arrays.asList(2,-12,23,54,0,-12);
        assertTrue(problem1.findElementMeetsMinTwice(elements).contains(-12));
        assertTrue(problem1.findElementMeetsMinTwice(elements).size()==1);

    }

    @Test
    public void findElementMeetsMinTwiceTest2(){
        List<Integer> elements = Arrays.asList(2,-12,23,54,0);
        assertTrue(problem1.findElementMeetsMinTwice(elements).size()==0);

    }
    @Test
    public void findElementMeetsMinTwiceTest3(){
        List<Integer> elements = Arrays.asList(0,-12,0,54,0,-12);
        assertTrue(problem1.findElementMeetsMinTwice(elements).contains(-12));
        assertTrue(problem1.findElementMeetsMinTwice(elements).contains(0));
        assertTrue(problem1.findElementMeetsMinTwice(elements).size()==2);

    }


}