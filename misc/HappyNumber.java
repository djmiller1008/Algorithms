import java.util.List;
import java.util.ArrayList;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }


    // Integer.valueOf is returning ascii value of the string number
    public static boolean isHappy(int n) {
        List<Integer> pastValues = new ArrayList<>();
        while (true) {
            String number = String.valueOf(n);
            char[] digits = number.toCharArray();
            int sum = 0;
            for (int i = 0; i < digits.length; i++) {
                
                int digit = Character.getNumericValue(digits[i]);
               
                sum = sum + digit * digit;
            }

            if (sum == 1) {
                return true;
            } else if (pastValues.contains(sum)) {
                return false;
            } else {
                pastValues.add(sum);
            }
            n = sum;

        }
    }
}
