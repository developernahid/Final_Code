package Threads.Thread1;

public class IntegerThreads implements Runnable{


    @Override
    public void run() {
        try {
            for (int i = 1; i <= 9999999; i++) {
                System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
                Thread.sleep(1000); // Allow thread switching
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
    }


}
