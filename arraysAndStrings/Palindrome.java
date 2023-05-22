public class Palindrome {
    public static void main(String[] args) {
        String s = "0a";
        System.out.println(isPalindrome(s));
       
    }

    public static Boolean isPalindrome(String s) {
        int front = 0;
        int back = s.length() - 1;
        while (front < back) {
            if (!Character.isLetterOrDigit(s.charAt(front))) {
                front++;
            } else if (!Character.isLetterOrDigit(s.charAt(back))) {
                back--;
            } else {
                if (Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(back))) {
                    return false;
                }
                front++;
                back--;
            }
        }
        return true;
    }
}
