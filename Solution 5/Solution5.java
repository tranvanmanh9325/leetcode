// Thêm thư viện
import java.util.*;

public class Solution5 {

    // Hàm tìm dãy con dài nhất
    public static String longestPalindrome(String s) {

        // Khai báo biến
        int n = s.length();
        if (n < 2) return s;

        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLength = 1;

        // Mọi kí tự riêng lẻ đều là palindrome
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Độ dài là 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
            else {
                dp[i][i + 1] = false;
            }
        }

        // Độ dài là 3
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j-1];
                }

                if (dp[i][j] && len > maxLength) {
                    start = i;
                    maxLength = len;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }

    // Hàm main
    public static void main(String[] args) {
        // Tạo Scanner
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến
        String s = scanner.nextLine();

        // Gọi hàm tìm dãy con dài nhất
        String result = longestPalindrome(s);

        System.out.println(result);
    }
}
