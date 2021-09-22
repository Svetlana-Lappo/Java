import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem2 {

    public List<Integer> findMostOftenElement(List<Integer> elements){

        List<Integer> res = new ArrayList<>();
        int maxCount=0;

        for(Integer currentElement: elements){

            if(count(elements,currentElement)>maxCount){
                maxCount = count(elements,currentElement);
                res.clear();
                res.add(currentElement);
            }
            if(count(elements,currentElement)==maxCount && !res.contains(currentElement)){
                res.add(currentElement);
            }

        }
        return res;
    }

    private int count(List<Integer> elements, int value){
        int count = 0;
        for(Integer element:elements){
            if(element==value){
                count++;
            }
        }
        return count;
    }
}
