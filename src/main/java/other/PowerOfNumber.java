package other;

public class PowerOfNumber {

    public static int power(int x, int y) {
        //O(logn)
        if (y == 0)
            return 1;
        int temp = power(x, y / 2);
        if (y % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }
}
