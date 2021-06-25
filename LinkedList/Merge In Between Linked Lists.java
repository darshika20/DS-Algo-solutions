/**
 * @Solution author : Darshika Jha
 * Question Link : https://leetcode.com/problems/merge-in-between-linked-lists/
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        // find tail of list2
        ListNode tail = list2;
        while(tail.next!=null){
            tail = tail.next;
        }
        
        // find ath node of list1
        ListNode start = list1;
        int a1 = a;
        while(a1-->1){
            start = start.next;
        }
        
        ListNode end = start.next;
        // find bth node of list1
        while(b-->a){
            end = end.next;
        }
        
        //make the link
        start.next = list2;
        tail.next = end.next;
        end.next = null;
        return list1;
    }
}
