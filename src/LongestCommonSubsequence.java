/**
 * Created by YSingh on 01/05/17.
 */
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println(lcs("ADBC", "ABCD"));
    }

    private static int lcs(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int [][] LCS = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    LCS[i][j] = 1 + LCS[i - 1][j - 1];
                }
                else {
                    LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
                }
            }
        }

        return LCS[m][n];
    }
}
