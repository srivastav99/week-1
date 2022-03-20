
    public class MyThreadExecutor implements Runnable {
        private int a;
        public class MyExecutor(int a){
            this.a=a;
        }

        @Override
        public void run() {
            System.out.println(a);
        }
    }




