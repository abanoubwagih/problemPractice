package hackerrank.easy;

public class DiagonalDifference {
    public static int diagonalDifference(int[][] arr) {
        int ltrDiagonal = 0;
        int rtlDiagonal = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            ltrDiagonal += arr[i][i];
            rtlDiagonal += arr[i][n - 1 - i];
        }
        return Math.abs(ltrDiagonal - rtlDiagonal);
    }

}
