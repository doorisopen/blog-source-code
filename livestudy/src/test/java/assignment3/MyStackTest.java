package assignment3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    void push() {
        MyStack stack = new MyStack();
        for (int i = 1; i < 15; i++) {
            stack.push(i);
        }

    }

    @Test
    void pop() {
        MyStack stack = new MyStack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 10; i++) {
            int top = stack.pop();
            System.out.println("top = " + top);
        }
    }

    @Test
    void pop_exception() {
        MyStack stack = new MyStack();
        Assertions.assertThrows(StackOverflowError.class, stack::pop);
    }
}
