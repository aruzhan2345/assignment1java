//time complexity: O(n), space complexity: O(n)
import java.util.Scanner;

public class problem1{
    public static int findMinimum(int[] A, int n) {
        if (n == 1) {
            return A[0];
        }
        return Math.min(A[n - 1], findMinimum(A, n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int min = findMinimum(A, n);
        System.out.println(min);
    }
}
