class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (dfs(board, word, visited, row, col, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(char[][] board, String word, boolean[][] visited, int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length)
            return false;

        if (visited[row][col])
            return false;
        if (word.charAt(index) != board[row][col])
            return false;

        visited[row][col] = true;

        if (dfs(board, word, visited, row, col - 1, index + 1))
            return true;

        if (dfs(board, word, visited, row, col + 1, index + 1))
            return true;

        if (dfs(board, word, visited, row - 1, col, index + 1))
            return true;

        if (dfs(board, word, visited, row + 1, col, index + 1))
            return true;

        visited[row][col] = false;

        return false;
    }
}
