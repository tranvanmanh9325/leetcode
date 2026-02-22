// Khai báo thư viện
import java.util.*;
import java.util.stream.IntStream;

public class Solution4 {

    // Hàm xử lí đầu vào
    public static int[] stringToIntegerArray(String input) {
        if (input.isEmpty()) return null;
        input = input.replaceAll("[\\[\\]]", "").trim();
        String[] arr = input.split(",");
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i].trim());
        }
        return nums;
    }

    // Hàm tìm số trung vị
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Khai báo biến
        double so_trung_vi;

        // Sử dụng IntStream để ghép hai mảng với nhau
        int[] arr = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
        Arrays.sort(arr);

        // Tìm số trung vị
        if ((arr.length % 2) == 0) {
            so_trung_vi = (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0;
        }
        else {
            so_trung_vi = arr[arr.length / 2];
        }

        // Trả kết quả của hàm tìm số trung vị
        return so_trung_vi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo chuỗi vào 1, 2
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        // Gọi hàm chuyển string sang mảng nguyên
        int[] nums1 = stringToIntegerArray(input1);
        int[] nums2 = stringToIntegerArray(input2);

        // Gọi hàm tìm số trung vị
        double so_trung_vi = findMedianSortedArrays(nums1, nums2);

        // In ra màn hình
        System.out.print(so_trung_vi);
        scanner.close();
    }
}