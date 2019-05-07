package hackerrank.easy;

import java.util.Arrays;

public class AVeryBigSum {
    public static long aVeryBigSum(long[] ar) {
        return Arrays.stream(ar).sum();
    }
}
