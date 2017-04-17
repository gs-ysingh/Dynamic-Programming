/**
 * Created by YSingh on 17/04/17.
 */
public class MinPath {
    public static void main(String[] args) {
        //Need to get the cost of min path to reach from 0,0 to 2,2 point
        int arr[][] = new int[][]
                                {
                                    {1, 3, 5, 8},
                                    {4, 2, 1, 7},
                                    {4, 3, 2, 3}
                                };
        System.out.println(getMinPath(arr, 0, 0, 2, 3));
        System.out.println(getMinPathDP(arr, 0, 0, 2, 3));
    }

    //Dynamic programming solution
    private static int getMinPathDP(int[][] arr, int row, int col, int M, int N) {
        for (int j = 1; j <= N; j++) {
            arr[0][j] = arr[0][j] + arr[0][j - 1];
        }

        for (int i = 1; i <= M; i++) {
            arr[i][0] = arr[i][0] + arr[i - 1][0];
        }

        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = arr[i][j] + Math.min(arr[i - 1][j], arr[i][j - 1]);
            }
        }

        return arr[M][N];
    }

    //Recursion solution
    private static int getMinPath(int[][] arr, int row, int col, int M, int N) {
        if (row == M && col == N) {
            return arr[row][col];
        }
        else if(row == M) {
            return arr[row][col] + getMinPath(arr, row, col + 1, M, N);
        }
        else if(col == N) {
            return arr[row][col] + getMinPath(arr, row + 1, col, M, N);
        }
        return arr[row][col]
                + Math.min(getMinPath(arr, row + 1, col, M, N),
                            getMinPath(arr, row, col + 1, M, N));
    }
}
