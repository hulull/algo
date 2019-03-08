public class LinkedStack {
    private ListNode dummy;
    public LinkedStack() {
        dummy = new ListNode(0);
    }
    public boolean push(int val) {
        ListNode node = new ListNode(val);
        node.next = dummy.next;
        dummy.next = node;
        return true;
    }

    public int pop() {
        if (dummy.next == null) {
            return Integer.MIN_VALUE;
        }
        ListNode node = dummy.next;
        dummy.next = dummy.next.next;
        return node.val;
    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
