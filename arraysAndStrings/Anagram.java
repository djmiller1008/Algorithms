import java.util.Map;
import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(Integer.valueOf("1"));
       
    }

    public static boolean isAnagram(String s, String t) {
        int[] freqArr = new int[26];
        int[] other = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freqArr[s.charAt(i) - 'a']++;
            other[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] != other[i]) {
                return false;
            }
        }
        return true;
    }
    
}
