package main.space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.util.concurrent.TimeUnit;

public class UnsafeMain {
    public static void main(String args[]) {
        UnsafeTask unsafeTask = new UnsafeTask();
        try{
            for(int i=0; i<10; i++) {
                Thread thread = new Thread(unsafeTask);
                thread.start();
                TimeUnit.SECONDS.sleep(2);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
