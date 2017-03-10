package deleteNodeInTheMiddleOfSinglyLinkedList;

/**
 * @author Kevin
 * @description 给定一个单链表中的一个等待被删除的节点(非表头或表尾)。请在在O(1)时间复杂度删除该链表节点。
 * @date 2017/3/10
 */
public class DeleteNodeInTheMiddleOfSinglyLinkedList {
    public static class TreeNode {

        public int val;
        public TreeNode next;

        public TreeNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void deleteNode(TreeNode node) {
        if (node == null || node.next == null){
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
