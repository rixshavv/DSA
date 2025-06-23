import java.util.Arrays;

public class RotateMatrixby90deg {

    public void rotate(int[][] matrix) {
        int N = matrix.length;

        // 1️⃣ Transpose the matrix
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // 2️⃣ Flip horizontally for clockwise rotation
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N - j - 1];
                matrix[i][N - j - 1] = temp;
            }
        }

        /*
        // 3️⃣ Flip vertically for anticlockwise rotation
        for (int col = 0; col < N; col++) {
            int row = 0;
            int mid = N / 2;
            while (row < mid) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[N - row - 1][col];
                matrix[N - row - 1][col] = temp;
                row++;
            }
        }
        */
    }

    public static void main(String[] args) {
        RotateMatrixby90deg sol = new RotateMatrixby90deg();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        sol.rotate(matrix);

        System.out.println("Rotated Matrix (Clockwise):");
        printMatrix(matrix);
    }

    // Helper to print the matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
