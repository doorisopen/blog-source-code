package assignment6;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public void add(Node newNode) {
        if (this.left == null) {
            this.left = newNode;
            return;
        }
        if (this.right == null) {
            this.right = newNode;
            return;
        }
        if (isFull(this.left)) {
            this.right.add(newNode);
        } else {
            this.left.add(newNode);
        }
    }

    private boolean isFull(Node node) {
        int count = calcNodeCount(node);
        return count == 3 || (long) Math.sqrt(count) == 3;
    }

    private int calcNodeCount(Node curr) {
        if (curr == null) {
            return 0;
        }
        int leftCount = calcNodeCount(curr.left);
        int rightCount = calcNodeCount(curr.right);
        return leftCount + rightCount + 1;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
