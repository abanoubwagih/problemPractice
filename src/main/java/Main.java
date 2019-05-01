import other.StringManipulation;

public class Main {

    public static void main(String[] args) {
//        System.out.println(SockMerchant.sockMerchant(5,new int[]{1,1,1,2,2}));
//        System.out.println(PowerOfNumber.power(5,2));
//        DuplicateCharFinder.findDuplicateChar("aabbbcddddser");
        System.out.println("-15 " + StringManipulation.isOnlyNumeric("-15"));
        System.out.println("15 " + StringManipulation.isOnlyNumeric("15"));
        System.out.println("20g " + StringManipulation.isOnlyNumeric("25g"));
    }
}
