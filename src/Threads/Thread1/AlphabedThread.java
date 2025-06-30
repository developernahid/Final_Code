package Threads.Thread1;

public class AlphabedThread implements Runnable {

    @Override
    public void run() {
        try {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println("Thread " + Thread.currentThread().getName() + ": " + c);
                Thread.sleep(1000); // Allow thread switching
                if(c== 'Z') {
                    c='A'; // Reset to 'A' after reaching 'Z'
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
    }
}
