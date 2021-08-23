public class Problem1 {
// the method should receive a string, reverse it and return it
    //@param str
    //@return
    public String solve(String str){
        String reverseStr = "";
        for(int i=0; i<str.length(); i++){

            reverseStr = str.charAt(i) + reverseStr;
        }
     return reverseStr;
    }
}
