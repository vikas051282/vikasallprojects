package com.company;

// interface with print()

interface Printer{
    public void print(String str, int number);
}

//class having lamda expression

public class LambdaProj2{

    public static void main(String[] args) {
    String text1 ="First";
    Printer printer1=(text,number) -> System.out.println(text+number);
    printer1.print("Emphasis", + 32);


    }
}
