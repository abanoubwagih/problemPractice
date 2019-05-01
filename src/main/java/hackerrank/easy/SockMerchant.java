package hackerrank.easy;

import java.util.HashSet;

public class SockMerchant {

//    https://www.hackerrank.com/challenges/sock-merchant/problem

    public static int sockMerchant(int n, int[] ar) {

        int pair = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (hashSet.contains(ar[i])) {
                hashSet.remove(ar[i]);
                pair++;
            } else {
                hashSet.add(ar[i]);
            }
        }
        return pair;
    }
}
