public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] numbers = { 4, 5, 6, 7, 1, 2 };
        System.out.println(findMin(numbers));
    }

    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
