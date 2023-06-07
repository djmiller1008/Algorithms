public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int length = grid.length;
        int width = grid[0].length;
        int freshOranges = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == 2) {
                    int[] cell = { i, j };
                    queue.add(cell);
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }
        if (freshOranges == 0) {
            return 0;
        }

        int depth = -1;
        int[] dirs = { -1, 0, 1, 0, -1 };
        while (!queue.isEmpty()) {
            int queueLength = queue.size();
            for (int i = 0; i < queueLength; i++) {
                int[] rottenOrange = queue.poll();
                int row = rottenOrange[0];
                int col = rottenOrange[1];
                for (int k = 0; k < 4; k++) {
                    int newRow = row + dirs[k];
                    int newCol = col + dirs[k + 1];
                  
                    if (newRow >= length || newRow < 0 || newCol >= width || newCol < 0) {
                        continue;
                    }

                    if (grid[newRow][newCol] == 1) {
                        int[] cell = { newRow, newCol };
                        queue.add(cell);
                        grid[newRow][newCol] = 2;
                    };
                }
            }
            depth++;
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return depth;
    }

    static Queue<int[]> findFreshOranges(int row, int col, Queue queue,int length, int width, int[][] grid) {
        if (row >= length || row < 0 || col >= width || col < 0) {
            return queue;
        }

        if (grid[row][col] == 1) {
            int[] cell = { row, col };
            queue.add(cell);
            grid[row][col] = 2;
        }
        return queue;
    }
}
