/**
 * Created by YSingh on 16/04/17.
 */
public class TotalPaths {
    public static void main(String[] args) {
        int N = 4;

        System.out.println(getPaths(0, 0, N - 1));
    }

    private static int getPaths(int row, int col, int N) {
        if(row == N && col == N) {
            return 1;
        }
        else if(row > N || col > N) {
            return 0;
        }
        return getPaths(row + 1, col, N) + getPaths(row, col + 1, N);
    }
}
