package assignment5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class MyQueueTest {

    @Test
    void push() {
        MyQueue queue = new MyQueue();
        for (int i = 0; i < 10; i++) {
            queue.push(i);
        }
    }

    @Test
    void poll() {
        MyQueue queue = new MyQueue();
        for (int i = 0; i < 10; i++) {
            queue.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(queue.poll());
        }
    }

    @Test
    void poll_exception() {
        MyQueue queue = new MyQueue();
        assertThrows(StackOverflowError.class, queue::poll);
    }
}
