/**
 * Created by YSingh on 29/04/17.
 */
public class EditDistance {
    public static void main(String[] args) {
        String str1 = "sunday";
        String str2 = "saturday";
        
        System.out.println(getDistance(str1, str2));
    }

    private static int getDistance(String str1, String str2) {
        int row = str1.length();
        int col = str2.length();
        int [][] M = new int[row + 1][col + 1];

        for (int i = 1; i <= row; i++) {
            M[i][0] = i;
        }
        for (int j = 1; j <= col; j++) {
            M[0][j] = j;
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    M[i][j] = M[i - 1][j - 1];
                }
                else {
                    M[i][j] = 1 + getMin(M[i - 1][j], M[i - 1][j - 1], M[i][j - 1]);
                }
            }
        }

        return M[row][col];
    }

    private static int getMin(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
