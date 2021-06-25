/**
 * @Solution author : Darshika Jha
 * Question Link : https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        while(k-->1){
            fast = fast.next;
        }
        ListNode start = fast;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        int val = slow.val;
        slow.val = start.val;
        start.val = val;
        return head;
    }
}
