package other;

import java.util.Arrays;

public class MissingNumber {

//    You are given a list of n-1 integers and these integers are in the range of 1 to n.
//    There are no duplicates in list. One of the integers is missing in the list.
//    Write an efficient code to find the missing integer.

    //Method 1 has bug integer overflow ====>> Time Complexity : O(n)
    //    1. Get the sum of numbers ->  total = n*(n+1)/2
    //    2  Subtract all the numbers from sum and you will get the missing number.

    public static int missingNumberBySum(int n, int[] ar) {
//        int total = n*(n+1)/2;
//        for (int i = 0; i < ar.length; i++) {
//            total -= ar[i];
//        }
//        return total;
        return (int) ((n * (n + 1) / 2) - Arrays.stream(ar).count());
    }

    //XOR item with it self remove it
    public static int missingNumber(int n, int[] ar) {

//        int l = Arrays.stream(ar).reduce(1, (a, b) -> a ^ b);
        int xorAll = 1;
        int xorArray = ar[0];
        for (int i = 2; i <= n; i++) {
            xorAll = xorAll ^ i;
        }
        for (int j = 1; j < ar.length; j++) {
            xorArray = xorArray ^ ar[j];
        }
        return xorAll ^ xorArray;
    }
}
