//time complexity: O(sqrt(n)), space complexity: O(1)
import java.util.Scanner;

public class problem3 {
    static boolean isPrime(int n, int i) {
        if (n <= 2)
            return (n == 2);
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isPrime(n, 2))
            System.out.println("Prime");
        else
            System.out.println("Composite");
    }
}
