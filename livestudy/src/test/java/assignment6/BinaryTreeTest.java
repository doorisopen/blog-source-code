package assignment6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

    private static final BinaryTree TREE = new BinaryTree();

    @BeforeEach
    void setup() {
        TREE.add(1);
        TREE.add(2);
        TREE.add(3);
        TREE.add(4);
        TREE.add(5);
        TREE.add(6);
        TREE.add(7);
    }

    @Test
    void add() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(1);
        binaryTree.add(2);
        binaryTree.add(3);
        binaryTree.add(4);
        binaryTree.add(5);
        binaryTree.add(6);
        binaryTree.add(7);
    }

    @Test
    void bfs() {
        TREE.bfs();
    }

    @Test
    void dfs() {
        TREE.dfs();
    }

    @Test
    void t1() {
        System.out.println((long) Math.sqrt(9));
        System.out.println((long) Math.sqrt(6));
        System.out.println((long) Math.sqrt(3));
        System.out.println((long) Math.sqrt(2));
        System.out.println((long) Math.sqrt(1));
    }
}
