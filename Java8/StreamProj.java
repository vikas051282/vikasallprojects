package com.company;

import java.util.Arrays;
import java.util.List;


//class performing map() and filter() on stream

public class StreamProj{

    public static void main(String[] args) {
//create List Object
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
//using forEach()

        numbers.forEach(element -> System.out.println(element));
        numbers.forEach(System.out::println);
        numbers.stream()
                . map(e -> e*2)
                .forEach(System.out::println);
        numbers.stream()
                .map(e -> e*2.0)
                .forEach(System.out::println);
//        System.out.println(numbers.stream()
//                .map(String::valueOf).forEach(System.out::println);
        //System.out.println(numbers.stream()
        //.map(e ->String.valueOf(e))
        // .reduce(**, (conctString, str)->conctString.concat(str)));
//        System.out.println(numbers.stream()
//                .map(e ->String.valueOf(e))
//                .reduce(**, String::concat));

        numbers.stream()
                .filter(e ->e*2 ==0)
                .map(e -> e*2)
                .forEach(System.out::println);
//        System.out.println(numbers.stream().map(e -> String.valueOf(e)).reduce(**, String::concat));
       System.out.println(numbers.stream().filter(e -> e*2 ==0)
                .map(e -> e*2).reduce(0,Integer::sum));
        System.out.println(numbers.stream().filter(e -> e*2 ==0)
                .map(e -> e*2).reduce((0,(total, num)->Integer.sum(total,num)));

    }
}
