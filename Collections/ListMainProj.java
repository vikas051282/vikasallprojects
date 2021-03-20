package com.company;

import java.util.*;

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
class Task{
public List<String> getResult(){
//Create list object

    ArrayList<String> result = new ArrayList<String>();
    result.add("A");
    result.add("B");
    result.add("C");
    result.add("D");
    result.add("E");

    return result;
    }
}

//Main class iterating the collection and calling getResult()

public class Main {

    public static void main(String[] args) {
        Task task= new Task();
          List<String> result = task.getResult();
          for(String text: result){
          System.out.println(text);

    }
    }
}
