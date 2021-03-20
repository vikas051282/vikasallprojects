package com.company;

//Parser class with private fields

public class Parser {
    //private static Parser parser;
    private static class ParcerHolder{
    private final static Parser PARSER= new Parser();
    }
//    static {
//        parser=new Parser();
//    }
//private constructor 

    private Parser(){
        System.out.println("Parser instantiated");
    }
    public static Parser getInstance(){
//        if(parser==null){
//           parser= new Parser();
//        }
       return ParcerHolder.PARSER;
    }
}
