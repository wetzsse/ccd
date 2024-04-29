package de.kvb.mammasoft.ccd.jm.library;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

//Non-atomic access to concurrently updated data structures 271
public class Beispiel4 {

    public static void main(String[] args) {
        PriorityQueue<String> integerQueue = new PriorityQueue<>();

        integerQueue.add("a");
        integerQueue.add("b");
        integerQueue.add("c");

        takeAndProcess(integerQueue);
    }

    static void takeAndProcess(Queue<String> queue) {
        //queue.poll()
        if (!queue.isEmpty()) {
            String element = queue.remove();
            // Process element
        }
    }

    static void beispiel2(){
        AtomicInteger atomic = new AtomicInteger(10);

        atomic.set(atomic.get() * 2);
        //atomic.updateAndGet(value -> value * 2);
    }
}
