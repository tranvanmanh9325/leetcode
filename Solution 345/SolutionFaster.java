import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SolutionFaster {
    // Hàm nguyên âm đảo ngược
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u',  'A', 'E', 'I', 'O', 'U'));
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (vowels.contains(arr[left])) {
                if (vowels.contains(arr[right])) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else  {
                left++;
            }
        }
        return new String(arr);
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