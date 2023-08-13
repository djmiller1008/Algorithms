import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        int[] first = { temperatures[0], 0 };
        stack.push(first);
        
        for (int i = 1; i < temperatures.length; i++) {
            while (temperatures[i] > stack.peek()[0]) {
                int[] element = stack.pop();
                answer[element[1]] = i - element[1];
                if (stack.empty()) {
                    break;
                }
            }
            int[] element = { temperatures[i], i };
            stack.push(element);
        }
        return answer;
    }
}
