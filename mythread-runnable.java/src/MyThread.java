public class MyThread  implements Runnable{
    public void run(){
        System.out.println('Thread');
    }
    public static void main(String[] args){
        Thread t=new Thread(new.MyThread());
        t.start()
    }
}
