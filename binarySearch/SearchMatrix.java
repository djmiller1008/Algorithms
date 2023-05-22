import java.util.Arrays;

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] numbers = {{ 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 }};
        int[] flattened = Arrays.stream(numbers).flatMapToInt(Arrays::stream).toArray();
        System.out.println(flattened[6]);
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
