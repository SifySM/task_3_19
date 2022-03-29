package edu.vsu.ru;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws Exception{
        SimpleQueue<String> queue = new MyLinkedListQueue<>();

        queue.add("stack");
        queue.add("list");
        queue.add("queue");
        queue.add("something");

        queue = queue.duplicateElements();

        System.out.println("Queue with duplicate elements:");

        int queueCount = queue.count();
        for (int i = 0; i < queueCount; i++) {
            System.out.print((i > 0 ? ", " : "") + queue.remove());
        }

        

        MyQueue<String> queue1 = new MyQueue<>();

        queue1.add("stack");
        queue1.add("list");
        queue1.add("queue");
        queue1.add("something");

        queue1 = queue1.duplicateElements();

        System.out.println();
        System.out.println();
        System.out.println("Queue with duplicate elements:");

        int queue1Count = queue1.size();
        for (int i = 0; i < queue1Count; i++) {
            System.out.print((i > 0 ? ", " : "") + queue1.remove());
        }
    }
}
