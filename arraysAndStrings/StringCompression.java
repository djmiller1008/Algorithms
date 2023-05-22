public class StringCompression {

    // "aabcccccaaa -> a2b1c5a3"
    // "If new string is less than or equal to length of original string, return the original string"
    public static void main(String[] args) {
       System.out.println(String.valueOf(3).length());
    }

    // adding to a string is O(nsquared) runtime. This algoirthm is O(p + ksquared) p is the length of the string, k is the number of char sequences
    public static String compress(String string) {
        String newString = "";
        int count = 1;
        char currentChar = string.charAt(0);

        for (int i = 1; i < string.length(); i++) {
            if (currentChar == string.charAt(i)) {
                count++;
            } else {
                newString += currentChar;
                newString += count;
                count = 1;
                currentChar = string.charAt(i);
            }
        }
        newString += currentChar;
        newString += count;
        return newString.length() < string.length() ? newString : string;
    }

    // String builder
    public static String betterCompress(String string) {
        StringBuilder newString = new StringBuilder();
        int count = 1;
        char currentChar = string.charAt(0);

        for (int i = 1; i < string.length(); i++) {
            if (currentChar == string.charAt(i)) {
                count++;
            } else {
                newString.append(currentChar);
                newString.append(count);
                count = 1;
                currentChar = string.charAt(i);
            }
        }
        newString.append(currentChar);
        newString.append(count);
        return newString.length() < string.length() ? newString.toString() : string;

    }

    


    
}
