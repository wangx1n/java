package ExcampleCollection;

/**
 * @program: Java
 * @description:
 * @author: wang xin
 * @create: 2021-01-30 17:48
 **/
public class ExampleCast {

    public static void main(String[] args) {
        Animal animal = new Animal();


        Dog dog = (Dog) animal;


        System.out.println(dog.toString());
    }
}
