package hackerrank.easy;

import java.util.Arrays;

public class SimpleArraySum {
    //https://www.hackerrank.com/challenges/simple-array-sum/problem
    public static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum();
    }

    public static int simpleArraySumWithLoop(int[] ar) {
        int sum = 0;
        for (int value : ar) {
            sum += value;
        }
        return sum;
    }
}
