import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PointsAndSegmentsTest {

    PointsAndSegments pointsAndSegments;
    List<Integer> points;

 @BeforeEach
 public void init(){
     points = Arrays.asList(2,-5,3,5,0);
     pointsAndSegments = new PointsAndSegments();
 }


 @Test
    public void getPointMaxIntersectedBySegments_Test(){
     List<Segment> segments = Arrays.asList(new Segment(-10,0),new Segment(-1,3), new Segment(3,5));
     assertTrue( pointsAndSegments.getPointMaxIntersectedBySegments(points,segments)==0);

 }

    @Test
    public void getPointMaxIntersectedBySegments_Test1(){
        List<Segment> segments = Arrays.asList(new Segment(0,3),new Segment(-6,2), new Segment(1,6));
        assertTrue( pointsAndSegments.getPointMaxIntersectedBySegments(points,segments)==2);

    }
    @Test
    public void getPointMaxIntersectedBySegments_Test2(){
        List<Segment> segments = Arrays.asList(new Segment(-5,-5),new Segment(-6,2), new Segment(3,5));
        assertTrue( pointsAndSegments.getPointMaxIntersectedBySegments(points,segments)==-5);
    }


}