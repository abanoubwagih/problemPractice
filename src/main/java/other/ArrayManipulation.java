package other;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayManipulation {
    public static String[] reverse(String[] array) {

        if (array == null || array.length < 2) {
            return array;
        }

        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static String[] reverseUsingCollection(String[] array) {

        List<String> listOfProducts = Arrays.asList(array);
        Collections.reverse(listOfProducts);
        return listOfProducts.toArray(array);
    }
}
