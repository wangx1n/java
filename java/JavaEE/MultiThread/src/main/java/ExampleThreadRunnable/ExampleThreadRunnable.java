package ExampleThreadRunnable;

/**
 * @author wangXin
 * @version 1.0
 * @date 2021/1/11 21:00
 */
//1.创建一个实现了Runnable接口的类
class ExampleThreadRunnable implements Runnable {
    //2.重写接口中的run方法
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

class TestThread{
    public static void main(String[] args) {
        //3.创建实现类的对象
        Thread thread = new Thread();
        //4.将此对象作为参数传递给Thread类的构造器中
        Thread thread1 = new Thread(thread);

        thread1.start();
    }

}
