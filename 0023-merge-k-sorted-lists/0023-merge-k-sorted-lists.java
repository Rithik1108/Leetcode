/**
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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        int n = lists.length;
        for(int i=0;i<n;i++){
            if(lists[i]!=null){
                pq.offer(lists[i]);
            }
        }
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while(!pq.isEmpty()){
            ListNode smallest = pq.poll();
            curr.next = smallest;
            curr = curr.next;
            if(smallest.next!=null){
                pq.offer(smallest.next);
            }
        }
        return head.next;
    }
}