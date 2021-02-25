package ThreadPool;

import java.util.concurrent.*;

/**
 * @program: Java
 * @description: 使用线程池创建线程
 * @author: wang xin
 * @create: 2021-01-23 17:44
 **/
public class ExampleThreadPool implements Runnable{
    public void run() {
        int sum = 0;

        for(int i = 0;i <= 100;i++)
        {
            sum+=i;
        }
        System.out.println("Runnable方法: "+sum);
    }
}

class ExampleThreadPoolCallable implements Callable{
    public Object call() throws Exception {
        int sum = 0;

        for(int i = 0;i <= 100;i++)
        {
            sum+=i;
        }
        return sum;
    }
}

class TestPool{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new ExampleThreadPool());

        ExampleThreadPoolCallable exampleThreadPoolCallable = new ExampleThreadPoolCallable();

        Object o = service.submit(exampleThreadPoolCallable).get();

        System.out.println(o);

        service.shutdown();
    }
}