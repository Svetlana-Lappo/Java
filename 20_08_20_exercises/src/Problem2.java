public class Problem2 {

    public String solve(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                if (Character.isLowerCase(str.charAt(i))) {
                    res += Character.toUpperCase(str.charAt(i));
                } else {
                    res += Character.toLowerCase(str.charAt(i));
                }
            } else {
                res += str.charAt(i);
            }
        }
        return res;
    }


    public String solve1(String str){
        char[] chars = str.toCharArray();
        char[] res = new char[chars.length];

        for(int i=0; i <chars.length; i++) {
            char current = chars[i];
            if (Character.isLowerCase(current)) {
                res[i] = Character.toUpperCase(current);
            } else {
                res[i] = Character.toLowerCase(current);
            }

        }
        return new String(res);
    }


}
