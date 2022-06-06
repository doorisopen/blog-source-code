package assignment5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeQueueTest {

    @Test
    void push() {
        NodeQueue queue = new NodeQueue();
        for (int i = 0; i < 10; i++) {
            queue.push(i);
        }
    }

    @Test
    void poll() {
        NodeQueue queue = new NodeQueue();
        for (int i = 0; i < 10; i++) {
            queue.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(queue.poll());
        }
    }

    @Test
    void poll_exception() {
        NodeQueue queue = new NodeQueue();
        assertThrows(StackOverflowError.class, queue::poll);
    }
}
