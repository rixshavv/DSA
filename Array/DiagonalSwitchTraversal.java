import java.util.*;

public class DiagonalSwitchTraversal{
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        // TreeMap to store elements by diagonal index (i + j)
        Map<Integer, List<Integer>> map = new TreeMap<>();

        // Fill map
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i + j;
                map.computeIfAbsent(key, ArrayList::new).add(mat[i][j]);
            }
        }

        List<Integer> result = new ArrayList<>();
        boolean flip = true;

        for (List<Integer> group : map.values()) {
            if (flip) {
                Collections.reverse(group);
            }
            result.addAll(group);
            flip = !flip;
        }

        // Convert List to int[] 
        return result.stream().mapToInt(i -> i).toArray();
    }

    // Test the function with sample input
    public static void main(String[] args) {
        DiagonalSwitchTraversal sol = new DiagonalSwitchTraversal();

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] result = sol.findDiagonalOrder(mat);

        System.out.println("Diagonal Order Output:");
        System.out.println(Arrays.toString(result));
        // Expected Output: [1, 2, 4, 7, 5, 3, 6, 8, 9]
    }
}
