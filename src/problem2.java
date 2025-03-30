//time complexity: O(n), space complexity: O(n)
import java.util.Scanner;

public class problem2{
    public static int sum(int[] arr, int n) {
        if (n == 0)
            return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        double average = (double) sum(arr, n) / n;
        System.out.println(average);
    }
}
