package minimumPathSum;

/**
 * @author Kevin
 * @description 最小路径和 给定一个只含非负整数的m*n网格，找到一条从左上角到右下角的可以使数字和最小的路径。
 * @date 2017/3/16
 */
public class MinumunPathSum {

    /**
     * 动态规划
     *
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int[][] sum = new int[m][n];
        sum[0][0] = grid[0][0];

        for (int i = 0; i < m; i++) {
            sum[i][0] = sum[i - 1][0] + grid[i][0];
        }

        for (int i = 0; i < n; i++) {
            sum[0][i] = sum[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                sum[i][j] = Math.min(sum[i - 1][j], sum[i][j - 1]) + grid[i][j];
            }
        }
        return sum[m - 1][n - 1];
    }
}
