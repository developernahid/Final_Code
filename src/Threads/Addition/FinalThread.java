package Threads.Addition;

public class FinalThread extends Thread{
    private SumThread sumT;
    private ProductThread mulT;

    public FinalThread(SumThread sumT, ProductThread mulT){
        this.sumT= sumT;
        this.mulT=mulT;
    }

    @Override
    public void run() {
        try {
            sumT.join();
            mulT.join();
            long finalSum= sumT.getSum()+mulT.getMul();
            System.out.println("Sum of(1-10) + Multi of (1-10) = "+finalSum);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
