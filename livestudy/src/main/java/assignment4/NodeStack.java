package assignment4;

import assignment2.ListNode;

public class NodeStack {
    private ListNode<Integer> head;

    public NodeStack() {
    }

    public void push(int data) {
        if (head == null) {
            head = new ListNode<Integer>(data);
        } else {
            head.next = new ListNode<Integer>(data);
            head.next.prev = head;
            head = head.next;
        }
    }

    public int pop() {
        if (head == null) {
            throw new StackOverflowError("stack is empty!");
        }
        int top = head.value;
        head = head.prev;
        return top;
    }

    public int size() {
        int size = 0;
        ListNode<Integer> temp = head;
        while (temp.prev != null) {
            size++;
            temp = temp.prev;
        }
        return size;
    }
}
