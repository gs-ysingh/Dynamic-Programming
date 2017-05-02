/**
 * Created by YSingh on 02/05/17.
 */
public class CoinChange {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        int m = arr.length;
        int n = 4;
        System.out.println(getCoin(arr, m, n));
    }

    private static int getCoin(int[] arr, int m, int n) {
        int [] M = new int[n + 1];

        M[0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = arr[i]; j <= n; j++) {
                M[j] = M[j] + M[j - arr[i]];
            }
        }

        return M[n];
    }
}
