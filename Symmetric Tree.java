class Solution {
    public boolean isSymmetric(TreeNode root) {
        return checkMirror(root.left, root.right);
    }
    public boolean checkMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return checkMirror(p.left, q.right) &&
               checkMirror(p.right, q.left);
    }
}
