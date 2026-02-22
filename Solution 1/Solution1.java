import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strNums = input.split(" ");
        int[] nums = new int[strNums.length];
        
        for(int i = 0; i < strNums.length; i++) {
            try {
                nums[i] = Integer.parseInt(strNums[i]); 
            }
            catch(NumberFormatException e) {
                System.out.println("Vui long nhap so nguyen hop le!");
            }
        }
        if(scanner.hasNextInt()) {
            int target = scanner.nextInt();
            int[] result = twoSum(nums, target);
            if(result != null) System.out.println(result[0] + " " + result[1]);
        }
        scanner.close();
    }
}