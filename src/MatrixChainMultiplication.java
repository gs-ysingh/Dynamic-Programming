/**
 * Created by YSingh on 03/05/17.
 */
public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        System.out.println(minMultiplication(arr, arr.length));
    }

    private static int minMultiplication(int[] arr, int n) {
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
