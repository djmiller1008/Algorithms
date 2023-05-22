public class productExceptSelf {
    public int[] productExceptSelfAnswer(int[] nums) {
        int[] answers = new int[nums.length];
        int runningProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            answers[i] = runningProduct;
            runningProduct = nums[i] * runningProduct;
        }

        runningProduct = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            answers[i] = answers[i] * runningProduct;
            runningProduct = nums[i] * runningProduct;
        }
        return answers;
        
    }
}
