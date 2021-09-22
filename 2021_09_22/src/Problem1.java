import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {

public List<Integer> findElementMeetsMinTwice(List<Integer> elements){

    List<Integer> res = new ArrayList<>();


    for(Integer currentElement: elements){
        if(count(elements,currentElement)>=2 && !res.contains(currentElement)){
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
