package ExcampleCollection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * @program: Java
 * @description: treeset test
 * @author: wang xin
 * @create: 2021-02-06 10:22
 **/
public class TestCollection {

    @Test
    public void test2(){
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;

                    myDate birth1 = e1.getBirth();
                    myDate birth2 = e2.getBirth();

                    int subYear = birth1.getYear()- birth2.getYear();
                    if(subYear != 0){
                        return subYear;
                    }

                    int subMonth = birth1.getMonth()-birth2.getMonth();
                    if(subMonth != 0){
                        return subMonth;
                    }

                    return birth1.getDay() - birth2.getDay();
                }

                return 0;
            }
        });

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
