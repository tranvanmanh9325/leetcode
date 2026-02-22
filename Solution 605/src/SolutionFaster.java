import java.util.Scanner;

public class SolutionFaster {
    // Hàm canPlaceFlowers
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Khai báo biến
        int i = 0;
        int length = flowerbed.length - 1;

        while (i <= length && n > 0) {
            if (i == length ||flowerbed[i] == 1) i+= 2;
            else if (flowerbed[i + 1] == 0) {
                n--;
                i+= 2;
            }
            else i+= 3;
            if (n == 0) break;
        }
        return n == 0;
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
