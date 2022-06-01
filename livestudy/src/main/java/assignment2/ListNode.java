package assignment2;

public class ListNode<T> {
    public T value;
    public ListNode<T> prev;
    public ListNode<T> next;

    public ListNode(T value) {
        this.value = value;
    }

    public ListNode(T value, ListNode<T> prev, ListNode<T> next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}
