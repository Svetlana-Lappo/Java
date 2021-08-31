/*
* The class describe segments, each of that has left and right end. Besides the left end is lower or equal than the right end*/

public class Segment {

   private int leftEnd;
   private int rightEnd;

    public Segment(int leftEnd, int rightEnd){

        this.leftEnd = leftEnd;
        this.rightEnd = rightEnd;
    }

    public int getLeftEnd() {
        return leftEnd;
    }

    public int getRightEnd() {
        return rightEnd;
    }

    public void setLeftEnd(int leftEnd) {
        this.leftEnd = leftEnd;
    }

    public void setRightEnd(int rightEnd) {
        this.rightEnd = rightEnd;
    }
}
