package code.tree.day1;

public class Q530 {

    int minval = Integer.MAX_VALUE;
    TreeNode prev;
    public int getMinimumDifference(TreeNode root) {
        inorderTree(root);
        return minval;
    }
    public void inorderTree(TreeNode node){
        if(node == null)
            return;
        inorderTree(node.left);
        if(prev != null)
            minval = Math.min(node.val - prev.val, minval);
        prev = node;
        inorderTree(node.right);
    }
    
    public void test(){
        return;
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode();
        root.val = 1;

        TreeNode left1 = new TreeNode();
        left1.val = 0;
        root.left = left1;

        TreeNode right1 = new TreeNode();
        right1.val = 48;
        root.right = right1;

        TreeNode left2 = new TreeNode();
        left2.val = 12;
        right1.left = left2;

        TreeNode right2 = new TreeNode();
        right2.val = 49;
        right1.right = right2;

        Q530 q530 = new Q530();
        System.out.println(q530.getMinimumDifference(root));
    }
}
