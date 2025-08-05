public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Use 3 sets of HashSet arrays to track rows, columns, and boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Traverse each cell
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];

                // Skip empty cells
                if (current == '.') continue;

                // Check row
                if (rows[i].contains(current)) return false;
                rows[i].add(current);

                // Check column
                if (cols[j].contains(current)) return false;
                cols[j].add(current);

                // Check 3x3 sub-box
                int boxIndex = (i / 3) * 3 + (j / 3);
                if (boxes[boxIndex].contains(current)) return false;
                boxes[boxIndex].add(current);
            }
        }

        return true; // Valid board
    }
}
