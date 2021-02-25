package ExampleLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: Java
 * @description: 使用ReentrantLock进行加锁
 * @author: wang xin
 * @create: 2021-01-23 11:29
 **/
public class ExampleThreadLock implements Runnable{
    private int ticket = 100;

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void run() {
        while (true)
            try {
                lock.lock();
                condition.signal();
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() +" "+ ticket);
                    ticket--;
                }
                else{
                    break;
                }
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {

            lock.unlock();
        }


    }
}
class TestThread{
    public static void main(String[] args) {
        ExampleThreadLock exampleThreadLock = new ExampleThreadLock();
        Thread thread1 = new Thread(exampleThreadLock);
        Thread thread2 = new Thread(exampleThreadLock);
        Thread thread3 = new Thread(exampleThreadLock);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
