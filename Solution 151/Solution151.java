import java.util.Scanner;

public class Solution151 {
    public static String reverseWords(String s) {
        s =  s.trim();
        StringBuffer stringBuffer = new StringBuffer();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                stringBuffer.append(words[i]).append(" ");
            }
        }
        return stringBuffer.toString();

    }

    public static void main(String[] args) {
        // Khai báo scanner
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến
        String input =  scanner.nextLine();

        // Gọi hàm xử lý
        String output = reverseWords(input);

        // In ra màn hình
        System.out.println(output);

        // Đóng scanner
        scanner.close();
    }
}
