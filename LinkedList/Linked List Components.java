/**
 * @Solution author : Darshika Jha
 * Question Link : https://leetcode.com/problems/linked-list-components/
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
    public int numComponents(ListNode head, int[] nums) {
        int counter = 0;
        int res = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        while(head != null){
            if(hs.contains(head.val)){
                counter = 1;
            }else{
                res += counter;
                counter = 0;
            }
            head = head.next;
        }
        return res+counter;
    }
}
