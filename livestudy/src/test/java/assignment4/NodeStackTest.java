package assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class NodeStackTest {

    @Test
    void push() {
        NodeStack stack = new NodeStack();
        for (int i = 0; i < 10; i++) {
            stack.push(i + 10);
        }
    }

    @Test
    void pop() {
        NodeStack stack = new NodeStack();
        for (int i = 0; i < 10; i++) {
            stack.push(i + 10);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("top = " + stack.pop());
        }
    }

    @Test
    void pop_exception() {
        NodeStack stack = new NodeStack();
        assertThrows(StackOverflowError.class, stack::pop);
    }
}
