package assignment6;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
    }

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.add(new Node(value));
        }
    }

    public void bfs() {
        StringBuilder sb = new StringBuilder();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            sb.append(curr.getValue()).append(" ");
            if (curr.getLeft() != null) {
                q.add(curr.getLeft());
            }
            if (curr.getRight() != null) {
                q.add(curr.getRight());
            }
        }
        System.out.println(sb.toString());
    }

    public void dfs() {
        if (root == null) {
            System.out.println("root is null!");
            return;
        }
        dfs(root);
    }

    private void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.getLeft());
        System.out.print(node.getValue() + " ");
        dfs(node.getRight());
    }
}
