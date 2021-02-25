package ExampleThreadSynchronized;

/**
 * @author wangXin
 * @version 1.0
 * @date 2021/1/13 17:34
 */
public class ExampleThreadSynchronized implements Runnable {
    private int ticket = 100;

    Object lock = new Object();

    public void run() {
        while(true){
              synchronized(this){
//            synchronized(lock){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName()+"卖票：票号:"+ticket);
                    ticket--;
                }
                else{
                    break;
                }
            }
        }
    }
}

class ExampleThreadSynchronizedNewThread extends Thread
{
    private static int ticket = 100;
    private static Object lock = new Object();

    @Override
    public void run() {
        while(true){
            //类也是对象
            //类只会加载一次
            synchronized(ExampleThreadSynchronizedNewThread.class){
//            synchronized(lock){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName()+"卖票：票号:"+ticket);
                    ticket--;
                }
                else{
                    break;
                }
            }
        }
    }
}

class TestThread{
    public static void main(String[] args) {
        ExampleThreadSynchronized exampleThreadSynchronized = new ExampleThreadSynchronized();
        Thread thread = new Thread(exampleThreadSynchronized);
        Thread thread1 = new Thread(exampleThreadSynchronized);
        thread.start();
        thread1.start();
    }
}

class TestThread2{
    public static void main(String[] args) {
        ExampleThreadSynchronizedNewThread exampleThreadSynchronizedNewThread1 = new ExampleThreadSynchronizedNewThread();
        ExampleThreadSynchronizedNewThread exampleThreadSynchronizedNewThread2 = new ExampleThreadSynchronizedNewThread();
        ExampleThreadSynchronizedNewThread exampleThreadSynchronizedNewThread3 = new ExampleThreadSynchronizedNewThread();
        exampleThreadSynchronizedNewThread1.start();
        exampleThreadSynchronizedNewThread2.start();
        exampleThreadSynchronizedNewThread3.start();
    }
}
