/**
 * Created by YSingh on 03/05/17.
 */
public class BinomialCoefficient {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(getBinomialCoefficient(n, k));
    }

    private static int getBinomialCoefficient(int n, int k) {
        int [][] M = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if(j == 0 || i == j) {
                    M[i][j] = 1;
                }
                else {
                    M[i][j] = M[i - 1][j - 1] + M[i - 1][j];
                }
            }
        }
        return M[n][k];
    }
}
