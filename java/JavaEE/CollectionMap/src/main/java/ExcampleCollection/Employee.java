package ExcampleCollection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @program: Java
 * @description: TreeSet排序
 * @author: wang xin
 * @create: 2021-02-06 10:10
 **/
public class Employee implements Comparable{

    private String name;
    private int age;
    private myDate birth;

    public Employee() {
    }

    public Employee(String name, int age, myDate birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public myDate getBirth() {
        return birth;
    }

    public void setBirth(myDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee e = (Employee)o;
            return this.name.compareTo(e.name);
        }
        return 0;
    }

    @Test
    public void test1(){
        TreeSet set = new TreeSet();

        Employee e1 = new Employee("wangxin",55,new myDate(1965,5,4));
        Employee e2 = new Employee("baoxiangyu",51,new myDate(1962,5,4));
        Employee e3 = new Employee("liudaehua",90,new myDate(1945,5,4));
        Employee e4 = new Employee("chaoji",55,new myDate(1963,5,4));
        Employee e5 = new Employee("wudi",52,new myDate(1965,5,12));

        List list = new ArrayList();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        set.addAll(list);

        System.out.println(set);
    }
}

class myDate{
    private int year;
    private int day;
    private int month;

    public myDate() {
    }

    public myDate(int year, int day, int month) {
        this.year = year;
        this.day = day;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "myDate{" +
                "year=" + year +
                ", day=" + day +
                ", month=" + month +
                '}';
    }
}
