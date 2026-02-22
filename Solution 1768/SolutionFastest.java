import java.util.Scanner;

public class SolutionFastest {
    // Hàm mergeAlternately
    public static String mergeAlternately(String word1, String word2) {
        char[] word1Char = word1.toCharArray();
        char[] word2Char = word2.toCharArray();
        int m = word1Char.length;
        int n = word2Char.length;
        char[] merged = new char[m + n];
        int i = 0, j =0, k = 0;
        while (i < m || j < n) {
            if (i < m) {
                merged[k++] = word1Char[i++];
            }
            if (j < n) {
                merged[k++] = word2Char[j++];
            }
        }
        return new String(merged);
    }


    // Hàm main
    public static void main(String[] args) {

        // Khai báo scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập word1
        System.out.print("Enter a word1: ");
        String word1 = scanner.nextLine();

        // Nhập word2
        System.out.print("Enter a word2: ");
        String word2 = scanner.nextLine();

        // Hàm mergeAlternately
        String result = mergeAlternately(word1, word2);

        // In kết quả ra màn hình
        System.out.print(result);
    }
}
