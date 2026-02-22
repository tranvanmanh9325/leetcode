import java.util.*;
public class Solution26 {
    public static int removeDuplicates(int[] nums) {
        int dem = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i -1]) {
                nums[dem] = nums[i];
                dem++;
            }
        }
        return dem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strInput = input.split(" ");
        int[] nums = new int[strInput.length];
        for(int i = 0; i < strInput.length; i++) {
            try {
                nums[i] = Integer.parseInt(strInput[i]);
            }
            catch(NumberFormatException e) {
                System.out.println("NULL");
            }
        }
        int dem = removeDuplicates(nums);
        for(int i = 0; i < dem; i++) {
            System.out.print(nums[i] + " ");
        }
        scanner.close();
    }
}