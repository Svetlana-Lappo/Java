import java.util.ArrayList;
import java.util.List;

public class PointsAndSegments {

    public int getPointMaxIntersectedBySegments(List<Integer> points, List<Segment> segments){

        int res = 0;
        int point = 0;
        for(Integer currentPoint: points) {
            int maxIntersect = 0;

            for (Segment segment : segments) {
                if (currentPoint >= segment.getLeftEnd() && currentPoint <= segment.getRightEnd()) {
                    maxIntersect++;
                }
            }

            if (maxIntersect >= res){
                res = maxIntersect;
                point = currentPoint;

            }

        }
    return point;
    }
}
