// Demonstrates arrays in Java
public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("First element: " + numbers[0]);
        System.out.println("Array length: " + numbers.length);
        // Loop through array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        // 2D array
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };
        System.out.println("2D Array element: " + matrix[1][1]);
    }
}
