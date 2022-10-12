import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author dhl
 * HashMap 的七种遍历方式
 * https://www.javazhiyin.com/102055.html
 */
public class HashMapTraverse {

    public static void main(String[] args) {
        demo7();
    }

    /**
     * 使用迭代器EntrySet
     * 此方法效率最佳
     */
    public static void demo1() {
        Map<Integer, String> map = new HashMap();
        map.put(1, "娇娇");
        map.put(2, "娇娇2");
        map.put(3, "娇娇3");
        map.put(4, "娇娇4");
        map.put(5, "娇娇5");
        map.put(6, "娇娇6");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }

    }

    /**
     * 使用迭代器的KeySet
     */
    public static void demo2() {
        Map<Integer, String> map = new HashMap();
        map.put(1, "娇娇");
        map.put(2, "娇娇2");
        map.put(3, "娇娇3");
        map.put(4, "娇娇4");
        map.put(5, "娇娇5");
        map.put(6, "娇娇6");
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("key ="+next);
            System.out.println(map.get(next));
        }

    }

    /**
     * 使用For Each EntrySet
     */
    public static void demo3() {
        Map<Integer, String> map = new HashMap();
        map.put(1, "娇娇");
        map.put(2, "娇娇2");
        map.put(3, "娇娇3");
        map.put(4, "娇娇4");
        map.put(5, "娇娇5");
        map.put(6, "娇娇6");
        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("entry.getKey()="+entry.getKey());
            System.out.println("entry.getValue()="+entry.getValue());
        }

    }

    /**
     * for each keySet
     */
    public static void demo4() {
        Map<Integer, String> map = new HashMap();
        map.put(1, "娇娇");
        map.put(2, "娇娇2");
        map.put(3, "娇娇3");
        map.put(4, "娇娇4");
        map.put(5, "娇娇5");
        map.put(6, "娇娇6");
        for (Integer key:map.keySet()){
            System.out.println("key ="+key);
            System.out.println("value="+map.get(key));
        }

    }

    /**
     * 使用lambda 表达式
     */
    public static void demo5() {
        Map<Integer, String> map = new HashMap();
        map.put(1, "娇娇");
        map.put(2, "娇娇2");
        map.put(3, "娇娇3");
        map.put(4, "娇娇4");
        map.put(5, "娇娇5");
        map.put(6, "娇娇6");
        map.forEach((key,value)->{
            System.out.println("key ="+key);
            System.out.println("value ="+map.get(key));
        });

    }

    /**
     * 使用Streams Api 单线程遍历
     */
    public static void demo6() {
        Map<Integer, String> map = new HashMap();
        map.put(1, "娇娇");
        map.put(2, "娇娇2");
        map.put(3, "娇娇3");
        map.put(4, "娇娇4");
        map.put(5, "娇娇5");
        map.put(6, "娇娇6");
        map.entrySet().stream().forEach((integerStringEntry -> {
            System.out.println(integerStringEntry.getKey());
            System.out.println(integerStringEntry.getValue());
        }));

    }

    /**
     * 使用Streams Api 多线程遍历
     */
    public static void demo7() {
        Map<Integer, String> map = new HashMap();
        map.put(1, "娇娇");
        map.put(2, "娇娇2");
        map.put(3, "娇娇3");
        map.put(4, "娇娇4");
        map.put(5, "娇娇5");
        map.put(6, "娇娇6");
        map.entrySet().parallelStream().forEach((integerStringEntry -> {
            System.out.println(integerStringEntry.getKey());
            System.out.println(integerStringEntry.getValue());
        }));

    }
}
