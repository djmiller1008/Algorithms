class ShortestCellPath {

	static int shortestCellPath(int[][] grid, int sr, int sc, int tr, int tc) {
    Queue<int[]> queue = new LinkedList<>();
    int[] start = { sr, sc };
    queue.add(start);
    int depth = -1;
    int[] deltas = { -1, 0, 1, 0, -1 }; 
    
    while (!queue.isEmpty()) {
      depth++;
      int queueSize = queue.size();
      for (int i = 0; i < queueSize; i++) {
        int[] cell = queue.poll();
        int row = cell[0];
        int col = cell[1];
        if (tr == row && tc == col) {
          return depth;
        }
        processCell(grid, row, col, queue, deltas);
      }
    }
    return -1;
      
  }
  
  private static void processCell(int[][] grid, int row, int col, Queue<int[]> queue, int[] deltas) {
    grid[row][col] = 0;
    for (int i = 0; i < deltas.length - 1; i++) {
      int rowToCheck = deltas[i];
      int colToCheck = deltas[i+1];
      if (rowToCheck >= 0 && rowToCheck < grid.length && colToCheck >= 0 && colToCheck < grid[0].length) {
        if (grid[rowToCheck][colToCheck] == 1) {
          int[] newCell = { rowToCheck, colToCheck };
          queue.add(newCell);
        }
      }
      
    }
    
  }

}
