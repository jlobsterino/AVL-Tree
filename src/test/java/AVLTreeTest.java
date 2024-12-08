import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AVLTreeTest {

    @Test
    public void testInsertionAndInOrderTraversal() {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(25);

        StringBuilder output = new StringBuilder();

        tree.inOrderTraversal(tree.root, output);

        assertEquals("10 20 25 30 ", output.toString());
    }

    @Test
    public void testDeletion() {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        tree.delete(30);

        StringBuilder output = new StringBuilder();
        tree.inOrderTraversal(tree.root, output);
        assertEquals("10 20 25 40 50 ", output.toString());
    }

    @Test
    public void testSearchExistingElement() {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);

        assertTrue(tree.search(20));
    }

    @Test
    public void testSearchNonExistingElement() {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);

        assertFalse(tree.search(40));
    }

    @Test
    public void testDeleteRoot() {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);

        tree.delete(20);

        StringBuilder output = new StringBuilder();
        tree.inOrderTraversal(tree.root, output);
        assertEquals("10 30 ", output.toString());
    }
}