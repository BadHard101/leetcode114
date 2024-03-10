import org.junit.Test;
import static org.junit.Assert.*;

public class FlattenTest {


    // Flattens a binary tree with both left and right subtrees.
    @Test
    public void test_flatten_binary_tree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        Solution2 solution = new Solution2();
        solution.flatten(root);

        assertEquals(1, root.val);
        assertNull(root.left);
        assertEquals(2, root.right.val);
        assertNull(root.right.left);
        assertEquals(3, root.right.right.val);
        assertNull(root.right.right.left);
        assertEquals(4, root.right.right.right.val);
        assertNull(root.right.right.right.left);
        assertEquals(5, root.right.right.right.right.val);
        assertNull(root.right.right.right.right.left);
        assertEquals(6, root.right.right.right.right.right.val);
        assertNull(root.right.right.right.right.right.left);
        assertNull(root.right.right.right.right.right.right);
    }

    // Flattens a null binary tree.
    @Test
    public void test_flatten_null_binary_tree() {
        TreeNode root = null;

        Solution2 solution = new Solution2();
        solution.flatten(root);

        assertNull(root);
    }

}