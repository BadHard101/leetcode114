class Solution2 {
    private TreeNode prev = null;

    /**
     * Flattens a binary tree to a linked list in-place.
     * This method uses a depth-first search approach to transform the given binary tree into a linked list.
     * The transformation is done in such a way that all nodes are moved to the right, and the left child of
     * every node is set to null. The order of the nodes in the linked list follows the preorder traversal
     * of the original binary tree.
     *
     * @param root The root node of the binary tree to be flattened. If the tree is empty (root is null),
     *             the method does nothing.
     */
    public void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }
}