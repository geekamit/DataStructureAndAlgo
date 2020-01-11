package chapter11;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    //https://github.com/PacktPublishing/Java-Coding-Problems/blob/master/Chapter11/P221_AtomicAction/src/modern/challenge/Main.java
    public static void main(String[] args) {
        AtomicIncrementator atomicIncrementator = new AtomicIncrementator();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        for (int i=0;i<1_000; i++){
//            executorService.execute(atomicIncrementator);
//            System.out.println(atomicIncrementator.getCount());
//        }

//        executorService = Executors.newFixedThreadPool(1);
//        for (int i=0;i<1_000 ; i++){
//            executorService.execute(atomicIncrementator);
//            System.out.println(atomicIncrementator.getCount());
//
//        }


    }
}
