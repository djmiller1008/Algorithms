class HouseRobber {

    public static void main(String[] args) {
        rob();
    }

    public static void rob() {
        int[] nums = { 2, 1, 1, 2};
        int[] memo = new int[nums.length + 1];
        memo[0] = 0;
        memo[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            memo[i+1] = Math.max(memo[i], memo[i-1] + val);
        }
        System.out.println(memo[nums.length]);

    }
}


