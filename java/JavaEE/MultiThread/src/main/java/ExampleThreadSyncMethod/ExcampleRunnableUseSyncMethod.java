package ExampleThreadSyncMethod;

import ExampleThreadSynchronized.ExampleThreadSynchronized;

/**
 * 使用同步方法
 */
public class ExcampleRunnableUseSyncMethod implements Runnable{

    private int ticket = 100;

    public void run() {
        while(true){
                Sale();
            }
    }

    private synchronized void Sale()
    {
        if(ticket > 0){
            System.out.println(Thread.currentThread().getName()+"卖票：票号:"+ticket);
            ticket--;
        }
    }
}

class TestThread{

    public static void main(String[] args) {
        ExcampleRunnableUseSyncMethod exampleThreadSynchronized = new ExcampleRunnableUseSyncMethod();
        Thread thread = new Thread(exampleThreadSynchronized);
        Thread thread1 = new Thread(exampleThreadSynchronized);

        thread.start();
        thread1.start();
    }
}


