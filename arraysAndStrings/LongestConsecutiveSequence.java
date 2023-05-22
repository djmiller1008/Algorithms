import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] array = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(array));
    }

    public static int longestConsecutive(int[] nums) {
        Map<Integer, Integer> hash = new TreeMap<>();
        for (int i : nums) {
            hash.put(i, i);
        }

        int max = 0, current = 0, prevValue = 0;
        for (int i : hash.keySet()) {
            if (current == 0) {
                current++;
                prevValue = i;
                continue;
            } 

            if ((i - prevValue) != 1) {
                max = Math.max(max, current);
                current = 1;
                prevValue = i;
            } else {
                current++;
                prevValue = i;
            }
        }
        return Math.max(current, max);
    }


}
