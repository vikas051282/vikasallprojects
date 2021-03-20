package com.company;

import java.util.Arrays;
import java.util.List;

//This class contains List object and using lambda expression printing the elements

public class ListProjectTest{

    public static void main(String[] args) {
	//Creating List Object
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
        numbers.forEach(element -> System.out.println(element));
        numbers.forEach(System.out::println);

    }
}
