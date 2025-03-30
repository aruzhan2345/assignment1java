//time complexity: O(n!), space complexity: O(n)
import java.util.Scanner;
public class problem7{
    public static void permute(String str,String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String a = str.substring(0, i) + str.substring(i + 1);
            permute(a, result + ch);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        permute(input, "");
    }
}