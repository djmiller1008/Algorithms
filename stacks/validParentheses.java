import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class validParentheses {
    public static void main(String[] args) {
        System.out.println(validParens("(])"));
    }

    public static boolean validParens(String s) {
        if (s.isEmpty()) {
            return false;
        }

        Map<Character, Character> parens = new HashMap<>();
        parens.put('{', '}');
        parens.put('[', ']');
        parens.put('(', ')');

        ArrayList<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (parens.containsKey(s.charAt(i))) {
                stack.add(s.charAt(i));
            } else if (parens.containsValue(s.charAt(i))) {
                if (stack.isEmpty()) {
                    return false;
                } else if (parens.get(stack.get(stack.size() - 1)).equals(s.charAt(i))) {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
