package ExampleCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: Java
 * @description: 使用Callable新建线程
 * @author: wang xin
 * @create: 2021-01-23 16:17
 **/
public class ExampleThreadCallable implements Callable {
    public Object call() throws Exception {
        int sum = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}
class TestThread{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExampleThreadCallable thread = new ExampleThreadCallable();

        FutureTask futureTask = new FutureTask(thread);

        Thread thread1 = new Thread(futureTask);

        thread1.start();

        Object o = futureTask.get();

        System.out.println(o);
    }
}