package space.gretawang.tp.threads.java7concurrencycookbook.chapter02.demo3;

public class Consumer implements Runnable{
    private EventStorage eventStorage;

    public Consumer(EventStorage eventStorage) {
        this.eventStorage = eventStorage;
    }

    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            eventStorage.get();
        }
    }
}
