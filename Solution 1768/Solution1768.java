import java.util.Scanner;

// Hàm main
public  class Solution1768 {

    // Hàm mergeAlternately
    public static String mergeAlternately(String word1, String word2) {

        // Khai báo biến
        int i = 0, j = 0;
        StringBuilder stringBuilder = new StringBuilder();
        String result;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                stringBuilder.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                stringBuilder.append(word2.charAt(j));
                j++;
            }
        }
        result = stringBuilder.toString();


        return result;
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