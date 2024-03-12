import leetcode.editor.util.ListNode;

public class Test {
    public static void main(String[] args) {
        ListNode tail = new ListNode(2);
        ListNode head = new ListNode(1,tail);
        System.out.println(head.toString());
        new Solution().reverseList(head);
        System.out.println(head.toString());

    }
}
