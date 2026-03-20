import java.util.Scanner;

public class Solution345 {
    // Hàm nguyên âm đảo ngược
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && vowels.indexOf(array[left]) == -1) left++;
            while (left < right && vowels.indexOf(array[right]) == -1) right--;

            if (left < right) {
                char temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return new String(array);
    }
    public static  void main(String[] args) {
        // Tạo scanner
        Scanner scanner = new Scanner(System.in);
        
        // Nhập đầu vào
        String s = scanner.nextLine();

        // Đóng scanner
        scanner.close();
    }
}
