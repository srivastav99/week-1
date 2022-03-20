import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

    public class MyExecutor {
        private static int i;

        public static void main(String[] args) {
            ExecutorService executor = Executors.newFixedThreadPool(5);

            Runnable b = new MyExecutor(1);
            executor.execute(b);
            Runnable b = new MyExecutor(2);
            executor.execute(b);
            Runnable b = new MyExecutor(3);
            executor.execute(b);
            Runnable b = new MyExecutor(4);
            executor.execute(b);
            Runnable b = new MyExecutor(5);
            executor.execute(b);
            Runnable b = new MyExecutor(6);
            executor.execute(b);
            Runnable b = new MyExecutor(7);
            executor.execute(b);
            Runnable b = new MyExecutor(8);
            executor.execute(b);
            Runnable b = new MyExecutor(8);
            executor.execute(b);
            Runnable b = new MyExecutor(9);
            executor.execute(b);
            Runnable b = new MyExecutor(10);
            executor.execute(b);

            executor.shutdown();
        }

    }

