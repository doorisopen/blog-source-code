package assignment2;

public class MyLinkedList<T> implements LinkedList<T> {

    public MyLinkedList() {
    }

    @Override
    public ListNode<T> add(ListNode<T> head, ListNode<T> nodeToAdd, int position) {
        if (head == null) {
            return nodeToAdd;
        }
        ListNode<T> curr = head;
        while (curr.next != null) {
            --position;
            if (position == 1) {
                break;
            }
            curr = curr.next;
        }
        if (curr.next != null) {
            nodeToAdd.next = curr.next;
            curr.next.prev = nodeToAdd;
        }
        nodeToAdd.prev = curr;
        curr.next = nodeToAdd;
        return head;
    }

    @Override
    public ListNode<T> remove(ListNode<T> head, int positionToRemove) {
        ListNode<T> curr = head;
        if (positionToRemove <= 1) {
            return curr.next;
        }
        while (curr.next != null) {
            --positionToRemove;
            if (positionToRemove <= 0) {
                break;
            }
            curr = curr.next;
        }
        curr.prev.next = curr.next;
        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }
        return head;
    }

    @Override
    public boolean contains(ListNode<T> head, ListNode<T> nodeToCheck) {
        while (head != null) {
            if (head.value == nodeToCheck.value) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public int size(ListNode<T> head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    public void toString(ListNode<T> head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.value).append(" ");
            head = head.next;
        }
        System.out.println(sb.toString());
    }
}
