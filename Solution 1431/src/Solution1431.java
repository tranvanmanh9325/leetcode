import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1431 {

    // Hàm kidsWithCandies
    List<Boolean> kidsWithCandies (int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) maxCandies = candy;
        }
        List<Boolean> results = new ArrayList<>(candies.length);
        for (int candy : candies) {
            results.add(candy + extraCandies >= maxCandies);
        }
        return results;

    }

    public static void main(String[] args) {

        // Tạo scanner
        Scanner scanner = new Scanner(System.in);
        Solution1431 solution1431 = new Solution1431();

        // Nhập input mảng candies
        System.out.print("Enter a candies: ");
        String lines = scanner.nextLine();
        String[] parts = lines.trim().split("\\s+");
        int[] candies = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            candies[i] = Integer.parseInt(parts[i]);
        }

        // Nhập input extraCandies
        System.out.print("Enter a extraCandies: ");
        int extraCandies = scanner.nextInt();

        // Hàm kidsWithCandies
        List<Boolean> results = solution1431.kidsWithCandies(candies, extraCandies);

        // In ra màn hình chính
        System.out.print(results);

    }
}