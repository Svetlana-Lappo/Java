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
}
