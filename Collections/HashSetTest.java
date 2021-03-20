package com.company;

import java.util.*;

//class Point contains variables x,y
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o ==null || getClass() != o.getClass()) return false;
        Point<?> point = (Point<?>) o;
        return Objects.equals(x, point.x) && Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

//This class have one method performing getResult() and calling add()

class Task{
    public Collection<Point> getResult(){
	//Creating HashSet Object
        HashSet<Point> result = new HashSet<Point>();
        result.add(new Point(2,4));
        result.add(new Point(3,6));
        result.add(new Point(4,8));
        result.add(new Point(2,4));
        result.add(new Point(5,10));
        System.out.println(result instanceof AbstractCollection);
        return result;
    }
}

//This class iterating the collection and calling getResult()

public class HashSetTest{

    public static void main(String[] args) {
        Task task= new Task();
        Collection<Point> result = task.getResult();
	//using iterator
        Iterator<Point> iterator= result.iterator();
        while(iterator.hasNext()){
            Point point = iterator.next();
            System.out.println(point);

        }
    }
}
