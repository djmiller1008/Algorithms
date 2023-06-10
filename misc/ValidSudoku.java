public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    if (!isValidCell(i, j, board)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    boolean isValidCell(int row, int col, char[][] board) {
        char value = board[row][col];
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == value && col != i) {
                return false;
            } else if (board[i][col] == value && row != i) {
                return false;
            }

            int subgridRow = 3 * (row / 3) + i / 3; // Calculate row index of subgrid
            int subgridCol = 3 * (col / 3) + i % 3; // Calculate column index of subgrid
            if (board[subgridRow][subgridCol] == value && subgridRow != row & subgridCol != col) {
                return false;
            }
        }
        return true;
    }
}
