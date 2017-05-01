/**
 * Created by YSingh on 01/05/17.
 */
public class MinCost {
    public static void main(String[] args) {
        int cost[][]= {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};
        System.out.print(minCost(cost, 3, 3));
    }

    private static int minCost(int[][] cost, int row, int col) {
        int [][] minCost = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i == 0 && j == 0) {
                    minCost[i][j] = cost[i][j];
                }
                if(i == 0 && j > 0) {
                    minCost[i][j] = cost[i][j] + cost[i][j - 1];
                }
                else if(j == 0 && i > 0) {
                    minCost[i][j] = cost[i][j] + cost[i - 1][j];
                }
                else if(i > 0 && j > 0) {
                    minCost[i][j] = cost[i][j] +
                            Math.min(minCost[i][j - 1], Math.min(minCost[i - 1][j - 1], minCost[i - 1][j]));
                }

            }
        }
        return minCost[row - 1][col - 1];
    }
}
