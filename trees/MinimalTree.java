

// Given a sorted (increasing order) array with unique integer elements, write an algorithm to create a binary search tree with minimal height


public class MinimalTree {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        TreeNode root = createMinimalBST(numbers, 0, numbers.length - 1);
        printTree(root);
        
    }

    public static TreeNode createMinimalBST(int[] numbers, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(numbers[mid]);
        n.left = createMinimalBST(numbers, start, mid - 1);
        n.right = createMinimalBST(numbers, mid + 1, end);
        return n;
    }

    public static void printTree(TreeNode root) {
        if (root != null) {
            printTree(root.left);
            printNode(root);
            printTree(root.right);
        }
    }

    public static void printNode(TreeNode node) {
        System.out.println(node.val);
    }


}

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
