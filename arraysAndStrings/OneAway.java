public class OneAway {
    public static void main(String[] args) {

    }

    public static boolean oneAway(String string1, String string2) {
        if (string1.length() == string2.length()) {
            return oneReplaceAway(string1, string2);
        } else if (string1.length() + 1 == string2.length()) {
            return oneInsertAway(string2, string1);
        } else if (string1.length() - 1 == string2.length()) {
            return oneInsertAway(string1, string2);
        }
        return false;
 
    }

    public static boolean oneReplaceAway(String str1, String str2) {
        boolean foundDiff = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (foundDiff) {
                    return false;
                } else {
                    foundDiff = true;
                } 
            }
        }
        return true;
    }

    public static boolean oneInsertAway(String longer, String shorter) {
        int longIndex = 0;
        int shortIndex = 0;

        while (longIndex < longer.length() && shortIndex < shorter.length()) {
            if (longer.charAt(longIndex) != shorter.charAt(shortIndex)) {
                if (longIndex != shortIndex) {
                    return false;
                } else {
                    longIndex++;
                }
            } else {
                longIndex++;
                shortIndex++;
            }
        }
        return true;
    }

}
