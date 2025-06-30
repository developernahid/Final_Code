package Threads.Addition;

public class ProductThread extends Thread{
    private long mul=1;

    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            mul*=i;
        }
        System.out.println("Multi of 1-10 : "+mul);
    }

    public long getMul(){
        return mul;
    }
}
