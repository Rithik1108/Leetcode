/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> res = new ArrayList<>();
       Queue<TreeNode> q = new LinkedList<>();
       if(root == null) return res;
       q.offer(root);
       while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int n = q.size();
            for(int i=0; i<n; i++){
                TreeNode front = q.poll();
                temp.add(front.val);
                if (front.left != null) q.offer(front.left);
                if (front.right != null) q.offer(front.right);
            }
            res.add(temp);
       } 
       return res;
    }
}