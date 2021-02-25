package ExcampleCollection;

import org.junit.Test;

import java.util.*;

/**
 * @program: Java
 * @description: Collection test
 * @author: wang xin
 * @create: 2021-01-29 11:26
 **/
public class CollectionExample {

    @Test
    public void TestCollectionExample(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(123);
        collection.add("A");

        System.out.println(collection);

        System.out.println(collection);
    }

    @Test
    public void TestIterator(){
        Collection collection = new ArrayList();
        collection.add(123);
        Integer[] integers = new Integer[]{1,3,4,5};
        collection.add(Arrays.stream(integers).toArray());
        collection.add("wangxin");
        collection.add(null);
        collection.add("zuihou");

        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

        Collection collection1 = new ArrayList();
        collection1.add(1);
        collection1.add("王鑫");
        List array1 = Arrays.asList("wangxin",1,3,2);

        collection1.addAll(array1);

        List array2 = new LinkedList();
        array2.add("lianbiaoceshi");
        array2.add("cesjo 2");

        collection1.addAll(array2);

        List list = new ArrayList();

        System.out.println(collection1);
    }
}
