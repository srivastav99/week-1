public class MultiThread extends Thread{
    public static void main(String[] args) {
        Thread t1 = new MultiThread();
        Thread t2 = new MultiThread();
        Thread t3 = new MultiThread();
        Thread t4 = new MultiThread();
        Thread t5 = new MultiThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
    @Override
    public void run(){
        System.out.println("Hello All");
    }
}


