package assignment2;

import org.junit.jupiter.api.Test;

class MyLinkedListTest {

    @Test
    void add() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        ListNode<Integer> head = null;

        System.out.println("\n==== add ====");
        head = list.add(head, new ListNode<>(1), 0);
        list.toString(head);
        head = list.add(head, new ListNode<>(2), 0);
        list.toString(head);
        head = list.add(head, new ListNode<>(3), 0);
        list.toString(head);
        head = list.add(head, new ListNode<>(4), 0);
        list.toString(head);
        head = list.add(head, new ListNode<>(5), 0);
        list.toString(head);
        head = list.add(head, new ListNode<>(6), 2);
        list.toString(head);

        System.out.println("\n==== remove ====");
        head = list.remove(head, 0);
        list.toString(head);
        head = list.remove(head, 1);
        list.toString(head);

        System.out.println("\n==== contains ====");
        System.out.println("1 is contains = " + list.contains(head, new ListNode<>(1)));
        System.out.println("2 is contains = " + list.contains(head, new ListNode<>(2)));
        System.out.println("3 is contains = " + list.contains(head, new ListNode<>(3)));
        System.out.println("4 is contains = " + list.contains(head, new ListNode<>(4)));
        System.out.println("5 is contains = " + list.contains(head, new ListNode<>(5)));
        System.out.println("6 is contains = " + list.contains(head, new ListNode<>(6)));
    }


}
