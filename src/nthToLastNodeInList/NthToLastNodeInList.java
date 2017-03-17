package nthToLastNodeInList;

/**
 * @author Kevin
 * @description 链表倒数第n个节点
 * @date 2017/3/17
 */
public class NthToLastNodeInList {

    static public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }


    ListNode nthToLast(ListNode head, int n) {
        if (head == null || n < 1) {
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        // 将指针p2指向链表位置为n
        for (int i = 0; i < n - 1; i++) {
            if (p2 == null) {
                return null;
            }
            p2 = p2.next;
        }

        // 继续将p2指针遍历至最后
        // 遍历的次数即倒数n的位置
        while (p2.next != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        return p1;
    }
}
