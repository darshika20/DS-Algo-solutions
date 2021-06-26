/**
 * @author : Darshika Jha
 * Question Link : https://leetcode.com/problems/odd-even-linked-list/
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
    public ListNode oddEvenList(ListNode head) {
        //base case
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode odd = new ListNode(0);
        ListNode todd = odd;
        ListNode even = new ListNode(0);
        ListNode teven = even;
        //odd.next = odd.next.next;
        int c = 1;
        ListNode temp = null;
        while(head!=null){
            if(c%2 == 1){ //odd
                odd.next = head;
                temp = head.next;
                head.next = null;
                head = temp;
                odd = odd.next;
            }else{ //even
                even.next = head;
                temp = head.next;
                head.next = null;
                head = temp;
                even = even.next;
            }
            c++;
        }
        odd.next = teven.next;
        return todd.next;
    }
}
