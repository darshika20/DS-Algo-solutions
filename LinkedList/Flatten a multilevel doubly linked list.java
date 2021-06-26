/*
 * @author : Darshika Jha
 * Question Link : https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null){
            return head;
        }
        flattenhelper(head);
        return head;
    }
    
    public Node flattenhelper(Node head){
        if(head == null){
            return null;
        }
        Node lofchild = flattenhelper(head.child);
        Node lofnext = flattenhelper(head.next);
        if(lofchild!=null){
            head.child.prev = head;
            Node temp = head.next;
            head.next = head.child;
            head.child = null;
            lofchild.next = temp;
            if(temp == null){
                return lofchild;
            }
            temp.prev = lofchild;
            return lofnext;
        }else{
            Node temp = head.next;
            if(temp == null){
                return head;
            }
            return lofnext;
        }
        
    }
}
