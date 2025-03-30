//time complexity: O(n), space complexity: O(n)
import java.util.Scanner;

public class problem8{
    public static boolean isdigits(String str, int i) {
        if (i== str.length())
            return true;
        if (!Character.isDigit(str.charAt(i)))
            return false;
        return isdigits(str, i + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (isdigits(input, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}