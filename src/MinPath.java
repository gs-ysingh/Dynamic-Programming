/**
 * Created by YSingh on 17/04/17.
 */
public class MinPath {
    public static void main(String[] args) {
        int arr[][] = new int[][]{ {1, 3, 5, 8}, {4, 2, 1, 7}, {4, 3, 2, 3}};
        System.out.println(getMinPath(arr, 0, 0, 2, 3));
    }

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
        return arr[row][col] + Math.min(getMinPath(arr, row + 1, col, M, N), getMinPath(arr, row, col + 1, M, N));
    }
}
