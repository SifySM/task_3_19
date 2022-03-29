package edu.vsu.ru;

import java.util.concurrent.LinkedBlockingQueue;

public class MyQueue<T> extends LinkedBlockingQueue<T> {
    public MyQueue<T> duplicateElements() {
        MyQueue<T> duplicateQueue = new MyQueue<>();

            for (T v : this) {
                duplicateQueue.add(v);
                duplicateQueue.add(v);
            }

        return duplicateQueue;
    }
}
