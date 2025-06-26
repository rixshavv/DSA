import java.util.ArrayList;
import java.util.List;




public class SpiralPrintingArray {




    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix.length == 0) return result;

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        int dir = 0;

        while (top <= bottom && left <= right) {
            if (dir == 0) {
                // Left to Right
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            } else if (dir == 1) {
                // Top to Bottom
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            } else if (dir == 2) {
                // Right to Left
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            } else if (dir == 3) {
                // Bottom to Top
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

            dir = (dir + 1) % 4;
        }

        return result;
    }

    public static void main(String[] args) {
        SpiralPrintingArray sol = new SpiralPrintingArray();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = sol.spiralOrder(matrix);

        System.out.println("Spiral Order: " + result);
    }
}

    

