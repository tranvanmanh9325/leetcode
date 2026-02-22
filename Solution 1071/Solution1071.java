import java.util.Scanner;

public class Solution1071 {

    // Hàm gcdOfStrings
    public static String gcdOfStrings(String str1, String str2) {

        // Khai báo biến
        int length1 = str1.length();
        int length2 = str2.length();

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int ucln = ucln(length1, length2);

        return str1.substring(0, ucln);
    }

    // Hàm tìm ước chung lớn nhất
    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // Hàm main
    public static void main(String[] args) {

        // Tạo scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập input str1
        System.out.print("Enter a str1: ");
        String str1 = scanner.nextLine();

        // Nhập input str2
        System.out.print("Enter a str2: ");
        String str2 = scanner.nextLine();

        // Hàm gcdOfStrings
        String result = gcdOfStrings(str1, str2);

        // In ra màn hình
        System.out.print(result);
    }
}