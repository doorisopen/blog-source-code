package assignment2;

public interface LinkedList<T> {
    ListNode<T> add(ListNode<T> head, ListNode<T> nodeToAdd, int position);

    ListNode<T> remove(ListNode<T> head, int positionToRemove);

    boolean contains(ListNode<T> head, ListNode<T> nodeToCheck);
}
