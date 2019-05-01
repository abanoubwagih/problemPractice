package other;

import java.util.Arrays;

public class AnagramCheck {
    //same char and length but different word
    public static boolean iAnagram(String word, String anagram) {
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);

        return Arrays.equals(charFromWord, charFromAnagram);
    }


    public static boolean checkAnagram(String firstStr, String secondStr) {
        char[] characters = firstStr.toCharArray();
        StringBuilder sbSecond = new StringBuilder(secondStr);

        for (char ch : characters) {
            int index = sbSecond.indexOf("" + ch);
            if (index != -1) {
                sbSecond.deleteCharAt(index);
            } else {
                return false;
            }
        }

        return sbSecond.length() == 0;
    }
}
