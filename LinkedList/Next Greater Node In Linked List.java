/**
 * @Solution author : Darshika Jha
 * Question Link : https://leetcode.com/problems/next-greater-node-in-linked-list/
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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        while(head != null){
            al.add(head.val);
            head = head.next;
        }
        Stack<Integer> st = new Stack<>();
       // st.push(al.size()-1);
        int[] res = new int[al.size()];
        //res[al.size()-1] = 0;
        for(int i = 0;i<al.size();i++){
            while(st.size()>0 && al.get(st.peek()) < al.get(i)){
                res[st.peek()] = al.get(i);
                st.pop();
            } 
            // if(st.size() == 0){
            //     res[i] = 0;
            // }else{
            //     res[i] = al.get(st.peek());
            // }
            st.push(i);
        }
        return res;
    }
}
