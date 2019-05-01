package codility;

import java.util.Arrays;
import java.util.Comparator;

public class BinaryGap {
    //https://app.codility.com/programmers/lessons/1-iterations/binary_gap/

    public static int getBinaryGap(int N) {

        String str = Integer.toBinaryString(N);
        if (!str.contains("0")) return 0;
        String[] t = str.split("[1]+");
        if (str.charAt(str.length() - 1) == '0') t[t.length - 1] = "";
        return Arrays.stream(t).max(Comparator.comparingInt(String::length)).get().length();
    }
}
