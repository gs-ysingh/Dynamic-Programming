/**
 * Created by YSingh on 03/05/17.
 */
public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        System.out.println(minMultiplicationDP(arr, arr.length));
        System.out.println(minMultiplication(arr, 1, arr.length - 1));
    }

    private static int minMultiplication(int[] arr, int start, int end) {
        if(start == end) {
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for (int k = start; k < end; k++) {
            min = Math.min(min,
                    minMultiplication(arr, start, k)
                            + minMultiplication(arr, k + 1, end)
                            + arr[start - 1] * arr[k] * arr[end]
            );
        }

        return min;
    }

    private static int minMultiplicationDP(int[] arr, int n) {
        int [][] M = new int[n][n];

        for (int i = 1; i < n; i++) {
            M[i][i] = 0;
        }
        int j = 0;
        for (int l = 2; l < n; l++) {
            for (int i = 1; i < n - l + 1; i++) {
                j = i + l - 1;
                M[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    M[i][j] = Math.min(M[i][j], M[i][k] + M[k + 1][j] + arr[i - 1] * arr[k] * arr[j]);
                }
            }
        }

        return M[1][n - 1];
    }
}
