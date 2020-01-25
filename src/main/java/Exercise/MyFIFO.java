package Exercise;

import java.lang.invoke.MutableCallSite;

public class MyFIFO {
    private int[] queue;
    private int maxSize;
    private int nElem;
    private int front;
    private int rear;

    public MyFIFO(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public void insert(int elem) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queue[++rear] = elem;
        elem++;
    }

    public int remove() {
        int temp = queue[front++];
        if (front == maxSize) {
            front = 0;
        }
        nElem--;
        return temp;
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }
    public int getFront() {
        return queue[front];
    }
    public  int getRear() {
        return queue[rear];
    }

    public boolean isFull() {
        return (nElem == maxSize - 1);
    }
    public int getSize() {
        return nElem;
    }

}