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
    
    //recursive solution
    //DFS: pre-order
    //Time: O(N) ; Space:  O(logN)
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper_binaryBuilder(nums,0, nums.length-1) ;
    }

    private TreeNode helper_binaryBuilder(int[] nums, int left, int right){
        if (left > right) return null;
        int m = (right + left) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = helper_binaryBuilder(nums, left, m - 1);
        root.right = helper_binaryBuilder(nums, m + 1, right);
        return root;
    }
}
