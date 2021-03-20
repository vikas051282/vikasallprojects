package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//Without Iterator Pattern

//class have add()/ getData()
class IntegerBox {
    private final List<Integer> list = new ArrayList<>();

    public void add(int in) {
        list.add(in);
    }

    public List getData() {
        return list;
    }
}

//class performing iteration

public class IteratorMain {
    public static void main(String[] args) {
        IntegerBox box = new IntegerBox();

	//using for loop 

        for (int i = 9; i > 0; --i) {
            box.add(i);
        }
        Collection integerList = box.getData();
        
         //using for loop

        for (Object anIntegerList : integerList) {
            System.out.print(anIntegerList + "  ");
        }
        System.out.println();
        integerList.clear();
        integerList = box.getData();
        System.out.println("size of data is: " + integerList.size());
    }
}


