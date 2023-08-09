class MinAbsDiffPairs {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = arr[i + 1] - arr[i];
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff == min) {
                List<Integer> ans = new ArrayList<>();
                ans.add(arr[i]);
                ans.add(arr[i + 1]);
                answer.add(ans);
            }
        }
        return answer;
    }
}