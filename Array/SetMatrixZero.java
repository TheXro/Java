public class SetMatrixZero {
    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    setZero(matrix, i, j);
                    // System.out.println(i + " " + j);
                }
            }
        }
    }

    static void setZero(int[][] matrix, int row, int col) {
        // for col
        for (int i = 1; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
        // for row
        for (int i = 1; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroes(matrix);

    }
}