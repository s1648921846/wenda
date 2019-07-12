package com.nowcoder;

import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void print(int index, Object object){
        System.out.println(String.format("{%d}, %s", index, object.toString()));
    }

    public static void demoString(){
        String str = "hello world";
        print(1, str.indexOf('x'));  // indexOf : 返回字符的位置
        print(2, str.charAt(4));     // charAt : 返回某个位置的字符
        print(3, str.codePointAt(1));
        print(4, str.compareToIgnoreCase("HELLO WORLD"));
        print(5, str.compareTo("hello uorld"));
        print(6, str.compareTo("hello xorld"));
        print(7, str.contains("hello"));
        print(8, str.concat("!!!"));
        print(9, str.toUpperCase());
        print(10, str.endsWith("world"));
        print(11, str.startsWith("hell"));
        print(12, str.replace('o', 'e'));
        print(13, str.replaceAll("o|l", "a"));
        print(14, str.replaceAll("hello", "hi"));
        print(15, str + str);

        StringBuilder sb = new StringBuilder(); // 非线程安全
        sb.append("x");
        sb.append(1.2);
        sb.append('a');
        sb.append(true);
        print(16, sb.toString());
     }

     public static  void demoList(){
        List<String> strList = new ArrayList<String>(10);
        for(int i=0; i<4; i++){
            strList.add(String.valueOf(i*i));
        }
        print(1, strList);

        List<String> strListB = new ArrayList<String>();
         for(int i=0; i<4; i++){
             strList.add(String.valueOf(i));
         }
         strList.addAll(strListB);
         print(2, strList);
         strList.remove(0);
         print(3, strList);
         strList.remove(String.valueOf(1));
         print(4, strList);
         print(5, strList.get(1));

         Collections.reverse(strList);
         print(6, strList);

         Collections.sort(strList);
         print(7, strList);

         for(String obj : strList){
             print(9, obj);
         }
         for(int i=0; i<strList.size(); i++){
             print(10, strList.get(i));
         }

         int[] array = new int[]{1, 2, 3};
         print(11, array[1]);
     }

     public static void demoMapTable(){
        Map<String, String> map = new HashMap<String, String>();
        for(int i=0; i<4; i++){
            map.put(String.valueOf(i), String.valueOf(i*i));
        }
        print(1, map);

        for(Map.Entry<String, String> entry : map.entrySet()){
            print(2, entry.getKey() + "|" + entry.getValue());
        }
        print(3, map.values());
        print(4, map.keySet());
        print(5, map.get("3"));
        print(6, map.containsKey("1"));
        map.replace("3", "27");
        print(7, map.get("3"));
     }

     public static void demoSet(){
        Set<String> strSet = new HashSet<String>();
        for(int i=0; i<3; i++){
            strSet.add(String.valueOf(i));
        }
        print(1, strSet);
        strSet.remove(String.valueOf(1));
        print(2, strSet);
        print(3, strSet.contains(String.valueOf(1)));
        print(4, strSet.isEmpty());
        print(5, strSet.size());
        strSet.addAll(Arrays.asList(new String[] {"A", "B", "C"}));
        print(6, strSet);
        for (String value : strSet){
            print(7, value);
        }
     }

     public static void demoException(){
        try{
            int k = 2;
            // k = k / 0;
            if(k == 2){
                throw new Exception("我故意的");
            }
        } catch (Exception e){
            print(2, e.getMessage());
        } finally {
            print(3, "finally");
        }
     }

     public static void demoFunction(){
        Random random = new Random();
        print(1, random.nextInt(1000));
        print(2, random.nextFloat());

        List<Integer> array = Arrays.asList(new Integer[] {1, 2, 3, 4, 5});
        Collections.shuffle(array);
        print(3, array);

         Date date = new Date();
         print(4, date);
         print(5, date.getTime());

         DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
         print(6, df.format(date));

         print(7, UUID.randomUUID());
         print(8, Math.log(10));
         print(9, Math.min(3, 10));
         print(10, Math.max(111, 10));
         print(11, Math.ceil(2.3));
         print(12, Math.floor(2.3));
     }

    public static void main(String[] args) {
        // print(1, "Hello World");
        // demoString();
        // demoList();
        // demoMapTable();
       // demoSet();
       //  demoException();

//        Animal a = new Animal("Jim", 1);
//        a.say();
//        Animal human = new Human("Lei", 12, "China");
//        human.say();

        demoFunction();
    }
}
