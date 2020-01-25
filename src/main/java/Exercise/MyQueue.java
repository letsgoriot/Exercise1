package Exercise;

import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        MyFIFO firstMF = new MyFIFO(10);

        firstMF.insert(10);
        firstMF.insert(20);
        firstMF.insert(30);
        firstMF.insert(40);
        firstMF.insert(50);

        firstMF.remove();
        firstMF.remove();
        firstMF.remove();

        firstMF.insert(60);

        while (!firstMF.isEmpty()) {
            int n = firstMF.remove();
            System.out.println("Elem" + n);
        }

    }


}

