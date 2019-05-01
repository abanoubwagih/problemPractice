package other;

import java.util.regex.Pattern;

public class StringManipulation {
    public static String reverseString(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static boolean isOnlyNumeric(String str) {
        Pattern pattern = Pattern.compile("^[-]?\\d+(\\.\\d+)?$");
        return pattern.matcher(str).matches();
    }

    public static int countOccurrencesOfSubstring(String str, String sub) {
        return str.split(Pattern.quote(sub), -1).length - 1;
    }
}
