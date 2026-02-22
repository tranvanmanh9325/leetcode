import java.util.Scanner;

public class Solution605 {

    // Hàm canPlaceFlowers
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Khai báo biến
        int length = flowerbed.length;
        for (int i = 0; i < length && n > 0; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyleft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyright = (i == length - 1) || (flowerbed[i + 1] == 0);

                // Nếu cả hai bên đều trống thì giảm số hoa trồng được
                if (emptyleft && emptyright) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0;
    }


    public static void main(String[] args) {

        // Tạo scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng trồng hoa
        System.out.print("Enter a flowerbed array: ");
        String lines = scanner.nextLine();
        String[] parts = lines.trim().split("\\s+");
        int[] flowerbed = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            flowerbed[i] = Integer.parseInt(parts[i]);
        }

        // Nhập n hoa có thể trồng
        System.out.print("Enter a n: ");
        int n = scanner.nextInt();

        // Gọi hàm
        boolean result = canPlaceFlowers(flowerbed, n);

        // In ra màn hình
        System.out.print(result);
    }
}


/*
605. Can Place Flowers

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.



        Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false


Constraints:

        1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
        0 <= n <= flowerbed.length
 */

