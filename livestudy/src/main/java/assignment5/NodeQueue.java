package assignment5;

import assignment2.ListNode;

public class NodeQueue {
    private ListNode<Integer> head;

    public NodeQueue() {
    }

    public void push(int data) {
        if (head == null) {
            head = new ListNode<>(data);
        } else {
            ListNode<Integer> tempHead = head;
            while (head.next != null) {
                head = head.next;
            }
            head.next = new ListNode<>(data);
            head = tempHead;
        }
    }

    public int poll() {
        if (head == null) {
            throw new StackOverflowError("queue is empty!");
        }
        int front = head.value;
        head = head.next;
        return front;
    }
}
