//time complexity: O(2^n), space complexity: O(n)
import java.util.Scanner;

public class problem5{
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }
}