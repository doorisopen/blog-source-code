package assignment5;

public class MyQueue {
    private int head = -1;
    private int tail = -1;
    private int[] values;

    public MyQueue() {
    }

    public void push(int data) {
        checkBuffer();
        values[tail++] = data;
    }

    public int poll() {
        if (head < 0 || head > tail) {
            throw new StackOverflowError("queue is empty!");
        }
        return values[head++];
    }

    private void checkBuffer() {
        if (values == null) {
            head = 0;
            tail = 0;
            values = new int[1];
        } else if (tail == values.length) {
            int[] tempBuffer = new int[values.length];
            System.arraycopy(values, 0, tempBuffer, 0, values.length);
            values = new int[values.length + 1];
            System.arraycopy(tempBuffer, 0, values, 0, tempBuffer.length);
        }
    }
}
