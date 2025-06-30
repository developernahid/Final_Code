package Threads.Addition;

public class Main {
    public static void main(String[] args){
        SumThread sumT= new SumThread();
        ProductThread mulT= new ProductThread();
        FinalThread finalTh= new FinalThread(sumT,mulT);
        sumT.start();
        mulT.start();
        finalTh.start();
    }
}
