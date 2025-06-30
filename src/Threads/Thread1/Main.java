package Threads.Thread1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create and start the alphabet thread


        // Create and start the integer thread
        Thread integerThread = new Thread(new IntegerThreads(), "IntegerThread");
        integerThread.start();

        Thread alphabetThread = new Thread(new AlphabedThread(), "AlphabetThread");
        alphabetThread.start();

        // Wait for both threads to finish
        System.out.println("Both threads have finished execution.");
    }
}