package removeLinkedListElements;

/**
 * @author Kevin
 * @description 删除链表中等于给定值val的所有节点。
 * 给出链表 1->2->3->3->4->5->3, 和 val = 3, 你需要返回删除3之后的链表：1->2->4->5。
 * @date 2017/3/7
 */
public class RemoveLinkedListElements {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeLinkedListElements(ListNode head, int val) {
        // dummy作为整个链表的头节点
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // head为遍历链表时的指针
        head = dummy;

        while (head.next != null) {
            // 下一个节点值相同 跳过该节点head位置不变
            if (head.next.val == val) {
                head.next = head.next.next;
            } else {
                // 下一个节点值不同 移动head指针到下一个节点
                head = head.next;
            }
        }
        return dummy.next;
    }
}
