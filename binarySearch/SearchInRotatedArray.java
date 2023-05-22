public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] numbers = { 4, 5, 6, 7, 1, 2, 3 };
        System.out.println(search(numbers, 6));
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // if true, side of inflection is the right side / can compare to left end because we know left side is in ascending order
            if (nums[mid] > nums[right]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
