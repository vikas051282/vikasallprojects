package com.company;

import java.util.*;

//class have variable x,y and constructor

class Point<T>{
    private T x,y;

    public Point(T x, T y) {
        this.x=x;
        this.y=y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

//class contains List object and adding elements to List
class Task{
    public List<String> getResult(){
	//creating list object
        ArrayList<String> result = new ArrayList<String>();
        result.add("A");
        result.add("B");
        result.add("C");
        result.add("D");
        result.add("E");

        return result;
    }
}

//Main class performing getResul()

public class ListTest{

    public static void main(String[] args) {
        Task task= new Task();
        Collection<String> result = task.getResult();

	//Using Iterator
        Iterator<String> iterator= result.iterator();
        while(iterator.hasNext()){
        String str = iterator.next();
        System.out.println(str);

        }
    }
}
