package ExampleThreadSyncMethod;

/**
 * @program: Java
 * @description: 继承Thread的线程安全问题，使用同步方法
 * @author: wang xin
 * @create: 2021-01-22 15:49
 **/
public class ExampleExtendsSyncMethod extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        while(true){
            Sale();
        }
    }

    private static synchronized void Sale()
    {
        if(ticket > 0){
            System.out.println(Thread.currentThread().getName()+"卖票：票号:"+ticket);
            ticket--;
        }
    }
}

class TestThread2{
    public static void main(String[] args) {
        ExampleExtendsSyncMethod exampleExtendsSyncMethod1 = new ExampleExtendsSyncMethod();
        ExampleExtendsSyncMethod exampleExtendsSyncMethod2 = new ExampleExtendsSyncMethod();

        exampleExtendsSyncMethod1.start();
        exampleExtendsSyncMethod2.start();

    }
}
