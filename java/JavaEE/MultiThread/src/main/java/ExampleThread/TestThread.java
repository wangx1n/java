package ExampleThread;

/**
 * @author wangXin
 * @version 1.0
 * @date 2021/1/11 17:05
 */
//1.创建子类继承Thread方法
class MyThread extends Thread{
    //2.重写子类的run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("hello");
    }
}
