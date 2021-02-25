package ExcampleCollection;

import org.junit.Test;

import java.util.Objects;

/**
 * @program: Java
 * @description: gou
 * @author: wang xin
 * @create: 2021-01-30 17:24
 **/
public class Dog extends Animal{

}

class Test2{

    public static void main(String[] args) {
        Animal animal = new Animal();


        Dog dog = (Dog) animal;


        dog.print();
    }
}
