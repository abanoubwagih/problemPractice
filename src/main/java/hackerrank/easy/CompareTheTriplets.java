package hackerrank.easy;

import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
    //https://www.hackerrank.com/challenges/compare-the-triplets/problem
    public static List<Integer> compareTripletsWithLoop(List<Integer> a, List<Integer> b) {
        List<Integer> result = Arrays.asList(0, 0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                result.set(0, result.get(0) + 1);
            } else if (a.get(i) < b.get(i)) {
                result.set(1, result.get(1) + 1);
            }
        }
        return result;
    }

}
