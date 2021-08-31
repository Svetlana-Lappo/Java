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

    public String solve1(String str){
//        StringBuilder sb = new StringBuilder(str);
//        return sb.reverse().toString();

        char[] chars = str.toCharArray();
        int middleIndex = chars.length/2;
        for(int i=0; i <middleIndex; i++){
            char temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;
        }
        return new String(chars);
    }
}
