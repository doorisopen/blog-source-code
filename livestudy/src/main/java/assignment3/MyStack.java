package assignment3;

public class MyStack {
    private int pos = -1;
    private int[] values;

    public MyStack() {
    }

    public void push(int data) {
        checkBuffer();
        values[pos++] = data;
    }

    public int pop() {
        if (pos < 0) {
            throw new StackOverflowError("stack is empty!");
        }
        return values[--pos];
    }

    private void checkBuffer() {
        if (values == null) {
            pos = 0;
            values = new int[1];
        } else if (pos == values.length) {
            int[] tempBuffer = new int[values.length];
            System.arraycopy(values, 0, tempBuffer, 0, values.length);
            values = new int[values.length + 1];
            System.arraycopy(tempBuffer, 0, values, 0, tempBuffer.length);
        }
    }
}
