package Threads.Addition;

public class SumThread extends Thread{
    private long sum=0;

    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            sum+=i;
        }
        System.out.println("Sum of 1-10 :"+sum);
    }

    public long getSum(){
        return sum;
    }
}
