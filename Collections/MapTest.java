package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Class have Map object with Map elements

public class MapTest{

    public static void main(String[] args) {
//creating Map Object
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        System.out.println(map);

        Set<Integer> keys= map.keySet();
//using iterator
        Iterator <Integer> iterator= keys.iterator();

        while(iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println(key + "." + map.get(key));
        }
    }
}
