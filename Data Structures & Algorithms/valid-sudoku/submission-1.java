class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer>[] rows = new HashSet[9];
        HashSet<Integer>[] cols = new HashSet[9];
        HashSet<Integer>[] boxes = new HashSet[9];

        // Initialize each array with a hashset
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<Integer>();
            cols[i] = new HashSet<Integer>();
            boxes[i] = new HashSet<Integer>();
        }

        // Iterate through sudoku
        for (int i = 0; i < 9; i++) {
             for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (rows[i].add(board[i][j] - '0') == false) return false;
                if (cols[j].add(board[i][j]  - '0') == false) return false;
                if (boxes[(i/3 * 3) + j/3].add(board[i][j]  - '0') == false) return false;
             }
        }
        return true;
    }
}
