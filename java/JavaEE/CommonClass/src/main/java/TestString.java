/**
 * @program: Java
 * @description: 常用类String
 * @author: wang xin
 * @create: 2021-01-24 12:04
 **/
public class TestString {

    String s1 = "wangxin";
    String s2 = "wang";
    String s3 = "xin";

    String s4 = s1 + "xin";
    String s5 = "wang" + s3;
    String s6 = s2 + s3;
    String s7 = (s2 + s3).intern();

    public static void main(String[] args) {

        TestString exampleString = new TestString();

        System.out.println(exampleString.s4 == exampleString.s1);
        System.out.println(exampleString.s5 == exampleString.s1);
        System.out.println(exampleString.s6 == exampleString.s1);
        System.out.println(exampleString.s7 == exampleString.s1);

        Human human = new Human();
        human.age = 14;
        human.name = "wangxin";

        exampleString.Change(human);

        System.out.println(human.name);
        System.out.println(human.age);
    }

    void Change(Human human){
        human.name = "王鑫";
        human.age = 24;
    }
}

class Human{
    public String name;

    public int age;
}
