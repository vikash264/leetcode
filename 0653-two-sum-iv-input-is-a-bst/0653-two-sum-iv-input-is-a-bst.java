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
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        BSTIterator leftIterator = new BSTIterator(root, false); 
        BSTIterator rightIterator = new BSTIterator(root, true);
        int left = leftIterator.next();
        int right = rightIterator.next();
        while(left < right) {
            if(left + right == k) return true;
            else if (left + right < k) left = leftIterator.next();
            else right = rightIterator.next();
        }
        return false;
    }
}

class BSTIterator{
    private Stack<TreeNode> stack=new Stack <>();
    private boolean isReverse;
    public BSTIterator(TreeNode root, boolean isReverse){
        this.isReverse = isReverse;
        pushAll(root);
    }
    public int next(){
        TreeNode node = stack.pop();
        if(!isReverse) pushAll(node.right);
        else pushAll(node.left);
        return node.val;
    }
    private void pushAll(TreeNode node){
        while (node != null){
            stack.push(node);
            node = isReverse ? node.right : node.left;
        }
    }
}