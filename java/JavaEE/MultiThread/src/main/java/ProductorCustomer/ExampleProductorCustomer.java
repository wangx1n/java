package ProductorCustomer;

import jdk.nashorn.internal.ir.CallNode;

/**
 * @program: Java
 * @description: 生产者消费者问题
 * @author: wang xin
 * @create: 2021-01-23 15:48
 **/

class Clerk{

    private int productCount = 0;

    public synchronized void produceProduct() throws InterruptedException {//生产产品
        if(productCount < 20){
            productCount++;
            System.out.println(Thread.currentThread().getName()+":开始生产第"+productCount+"个产品");
            notify();
        }else{
            wait();
        }
    }

    public synchronized void consumeProduct() throws InterruptedException {//消费产品
        if(productCount > 0){
            System.out.println(Thread.currentThread().getName()+":开始消费第"+productCount+"个产品");
            productCount--;
            notify();
        }
        else{
            wait();
        }
    }
}

class Producor implements Runnable{
    private Clerk clerk;

    public Producor(Clerk clerk) {
        this.clerk = clerk;
    }

    public void run() {
        System.out.println("生产者"+Thread.currentThread().getName()+" 开始生产产品");

        while(true) {
            try {
                clerk.produceProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Comsumer implements Runnable{
    private Clerk clerk;

    public Comsumer(Clerk clerk) {
        this.clerk = clerk;
    }


    public void run() {
        System.out.println("消费者"+Thread.currentThread().getName()+" 开始消费产品");

        while(true) {
            try {
                clerk.consumeProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ExampleProductorCustomer{
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producor producor1 = new Producor(clerk);
        Thread producorThread = new Thread(producor1);

        Comsumer comsumer1 = new Comsumer(clerk);
        Thread consumerThread = new Thread(comsumer1);

        producorThread.start();
        consumerThread.start();
    }

}
