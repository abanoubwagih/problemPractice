package other;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;

public class DuplicateCharFinder {
    public static void findIt(String str) {
        Map<Character, Integer> baseMap = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (Character ch : charArray) {
            if (baseMap.containsKey(ch)) {
                baseMap.put(ch, baseMap.get(ch) + 1);
            } else {
                baseMap.put(ch, 1);
            }
        }
        baseMap.forEach((ch, count) -> {
            if (baseMap.get(ch) > 1) {
                System.out.println(ch + "  is " + count + " times");
            }
        });
    }

    public static void findDuplicateChar(String str) {
        Map<String, Long> baseMap = str.chars().mapToObj(i -> (char) i)
                .collect(collectingAndThen(Collectors.groupingBy(Object::toString, Collectors.counting()), map -> {
                    map.values().removeIf(count -> count < 2);
                    return map;
                }));
        baseMap.forEach((ch, count) -> System.out.println(ch + "  is " + count + " times"));

    }
}
