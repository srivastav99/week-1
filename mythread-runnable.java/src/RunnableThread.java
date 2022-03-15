public class RunnableThread implements Runnable{
    public static void main(String[] args) {
        Runnable runnable=new RunnableThread();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);
        Thread t5 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
    @Override
    public void run(){
        System.out.println("Hello India");
    }

}
