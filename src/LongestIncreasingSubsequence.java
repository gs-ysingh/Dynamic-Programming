/**
 * Created by YSingh on 01/05/17.
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int [] arr = {5, 1, 10, 2, 3, 4};
        System.out.println(lis(arr));
    }

    private static int lis(int[] arr) {
        int n = arr.length;
        int [] LIS = new int[n];

        for (int i = 0; i < n; i++) {
            LIS[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    LIS[i] = Math.max(1 + LIS[j], LIS[i]);
                }
            }
        }

        return LIS[n - 1];

    }
}
