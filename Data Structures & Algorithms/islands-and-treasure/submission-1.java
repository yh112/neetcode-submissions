class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 0) {
                    queue.offer(new int[] {row, col});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            int row = current[0];
            int col = current[1];

            for (int i = 0; i < 4; i++) {
                int nextRow = row + dr[i];
                int nextCol = col + dc[i];

                if (nextRow < 0 || nextCol < 0 || nextRow >= grid.length
                    || nextCol >= grid[0].length)
                    continue;

                if (grid[nextRow][nextCol] == Integer.MAX_VALUE) {
                    grid[nextRow][nextCol] = grid[row][col] + 1;
                    queue.offer(new int[] {nextRow, nextCol});
                }
            }
        }
    }
}
