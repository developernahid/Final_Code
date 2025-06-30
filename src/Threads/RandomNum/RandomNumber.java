package Threads.RandomNum;
import java.util.Random;
public class RandomNumber implements Runnable{
    private Random random= new Random();
    @Override
    public void run() {
        makeRandom();
    }
    public void makeRandom(){
       try {
           for (int i=0; i<3; i++){
               int num= generateRandomNumber();
               System.out.println(Thread.currentThread().getName()+" Generate-"+num);
               Thread.sleep(2000);
           }
       }
       catch (InterruptedException e){
           System.out.println(e.getMessage());
       }
    }
    private int generateRandomNumber(){
        final int i = random.nextInt();
        return i;
    }
}
