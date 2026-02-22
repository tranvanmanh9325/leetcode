// Import thư viện
import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }

    // Phương thức deserialize để chuyển chuỗi thành danh sách liên kết
    public static ListNode deserialize(String input) {
        if(input.isEmpty()) return null;
        // Loại bỏ kí tự không cần thiết
        input = input.replaceAll("[\\[\\]]", "").trim();
        String[] strNums = input.split(",");
        ListNode head = new ListNode(Integer.parseInt(strNums[0].trim()));
        ListNode current = head;
        for(int i = 1; i < strNums.length; i++) {
            current.next = new ListNode(Integer.parseInt(strNums[i].trim()));
            current = current.next;
        }
        return head;
    }
}

public class Solution2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode con_tro = result;
        int carry = 0; // carry là biến nhớ
        while(l1 != null || l2 != null) {
            int so_thu_nhat = (l1 != null) ? l1.val : 0;
            int so_thu_hai = (l2 != null) ? l2.val : 0;
            int sum = so_thu_nhat + so_thu_hai + carry;
            carry = sum / 10; // Cập nhật biến nhớ
            con_tro.next = new ListNode(sum % 10); // Lưu giá trị vào nút
            con_tro = con_tro.next; // CHuyển con trỏ sang nút tiếp theo
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if(carry > 0) {
            con_tro.next = new ListNode(carry);
        }
        return result.next; // Trả về kết quả
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập danh sách liên kết đơn đầu tiên
        String input1 = scanner.nextLine(); // Đọc input từ bàn phím
        ListNode l1 = ListNode.deserialize(input1);

        // Nhập danh sách liên kết đơn thứ hai
        String input2 = scanner.nextLine();
        ListNode l2 = ListNode.deserialize(input2);

        // Gọi hàm addTwoNumbers
        ListNode result = addTwoNumbers(l1, l2);

        // In kết quả
        ListNode current = result;
        StringBuilder sb = new StringBuilder();
        // Mở ngoặc in kết quả
        sb.append("[");
        while(current != null) {
            sb.append(current.val);
            if(current.next != null) sb.append(",");
            current = current.next;
        }
        // Đóng ngoặc in kết quả
        sb.append("]");
        System.out.print(sb.toString());
        scanner.close();
    }
}