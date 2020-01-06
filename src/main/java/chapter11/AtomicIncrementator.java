package chapter11;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIncrementator implements Runnable{

    AtomicInteger atomicInteger = new AtomicInteger();
    public void run(){
        System.out.println("Thread "+ Thread.currentThread().getName());
        atomicInteger.incrementAndGet();
    }

    public Integer getCount(){
        return atomicInteger.get();

    }

}
