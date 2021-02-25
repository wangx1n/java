package Singleton;

/**
 * @program: Java
 * @description: 使用同步机制，解决单例模式中的懒汉式为线程安全
 * @author: wang xin
 * @create: 2021-01-22 15:58
 **/
public class ExampleMultiThread {

}

class Bank {
    //1.私有化构造器
    private Bank(){}
    //2.私有static Bank类型
    private static Bank instance = null;
    //方式一
//    public static synchronized Bank getInstance(){
//        if (instance == null)
//        {
//            instance = new Bank();
//        }
//        return instance;
//    }
    //方式二
    public static Bank getInstance(){
        if(instance == null){
            synchronized (Bank.class){
                if (instance == null){
                    instance = new Bank();
                }
            }
        }
        return instance;
    }

}
