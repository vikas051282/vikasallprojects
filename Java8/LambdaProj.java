package com.company;

//interface with print()

interface Printer{
    public void print(String str);
}

//class with lambda expression

public class LambdaProj{

    public static void main(String[] args) {
        Printer printer = (text)-> System.out.println("text");

        printer.print("Emphasis");
    }
}
