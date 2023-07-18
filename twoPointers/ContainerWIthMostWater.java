public class ContainerWIthMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int currentArea = 0;
        int maxArea = 0;
        

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            currentArea = h * (right - left);
            maxArea = Math.max(currentArea, maxArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
