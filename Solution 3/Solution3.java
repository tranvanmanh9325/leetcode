// Khai báo thư viện
import java.util.*;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0, trai = 0, phai = 0;
        HashSet <Character> set = new HashSet<>();
        while (phai < n) {
            if (!set.contains(s.charAt(phai))) {
                set.add(s.charAt(phai));
                maxLength = Math.max(maxLength, phai - trai + 1);
                phai++;
            }
            else {
                set.remove(s.charAt(trai));
                trai++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập chuỗi vào
        String input = scanner.nextLine();
        // Khai báo biến maxLength
        int maxLength = new Solution3().lengthOfLongestSubstring(input);
        // In ra màn hình
        System.out.print(maxLength);
        scanner.close();
    }
}