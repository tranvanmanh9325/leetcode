import java.util.Scanner;

class Main {

    // Hàm xử lí
    public static boolean isPalindrome (String input) {
        if (input == null || input.length() == 0) {
            return true;
        }
        int len = input.length();
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Tạo scanner
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Hàm xử lý
        System.out.println(isPalindrome(input) ? "Palindrome" : "Not palindrome");

    }
}