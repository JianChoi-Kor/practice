package com.example.practice.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        for (int i = 1; i <= 1000000; i++) {
            map.put("key" + i, "value" + i);
        }

        long startTime = System.currentTimeMillis();
        forEachLambdaLoop(map);
        long endTime = System.currentTimeMillis();

        System.out.println("elapsed " + (endTime - startTime) + "(ms)");

//        //방법 1
//        Iterator<String> keys = map.keySet().iterator();
//        while (keys.hasNext()) {
//            String key = keys.next();
//            System.out.println(String.format("key: %s, value: %s", key, map.get(key)));
//        }
//
//        //방법 2
//        for (Map.Entry<String, String> elem : map.entrySet()) {
//            System.out.println(String.format("key: %s, value: %s", elem.getKey(), elem.getValue()));
//        }
//
//        //방법 3
//        for (String key : map.keySet()) {
//            System.out.println(String.format("key: %s, value: %s", key, map.get(key)));
//        }
//
//        //방법 4
//        map.forEach((key, value) -> {
//            System.out.println(String.format("key: %s, value: %s", key, value));
//        });
    }

    public static void iteratorLoop(Map<String, String> map) {
        Iterator<String> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            String value = map.get(key);
        }
    }

    public static void entrySetLoop(Map<String, String> map) {
        //방법 2
        for (Map.Entry<String, String> elem : map.entrySet()) {
            String key = elem.getKey();
            String value = elem.getValue();
        }
    }

    public static void keySetLoop(Map<String, String> map) {
        //방법 3
        for (String key : map.keySet()) {
            String value = map.get(key);
        }
    }

    public static void forEachLambdaLoop(Map<String, String> map) {
        //방법 4
        map.forEach((key, value) -> {
            System.out.println(String.format("key: %s, value: %s", key, map.get(key)));
        });
    }
}
