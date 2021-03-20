package com.company;

import com.sun.xml.internal.ws.util.CompletedFuture;

import java.util.concurrent.CompletableFuture;

//class performing compute()/ create()

public class CompletableFutureTest{
    // define compute()
    public static int compute(){
        System.out.println("Inside compute :" + Thread.currentThread());
        return 2;
    }
    //calling create()
    public static CompletableFuture<Integer> create(){
       return  CompletableFuture.supplyAsync(() -> compute()) ;
    }

    public static CompletableFuture<Integer> create(int number){
        return  CompletableFuture.supplyAsync(() -> number) ;
    }

    public static void print(int data){

        System.out.println("Inside print :" + Thread.currentThread());
        System.out.println(data);
    }
    public static void main(String[] args) {
    //create().thenAccept(value -> System.out.println(value));
//    create().thenAccept(value -> print(value))
//            .thenRun(() -> System.out.println("1"))
//            .thenRun(() -> System.out.println("2"))
//            .thenRun(() -> System.out.println("3"));
        CompletableFuture<Integer> cf = new CompletableFuture<>();
        process(cf);
     //   cf.complete(4);
        create(2).thenCombine(create(3),(result1,result2) ->result1+result2)
                .thenAccept(sumResult -> System.out.println(sumResult));
        System.out.println("End");
    }
    public static void process(CompletableFuture<Integer> cf){
        cf
        .thenApply(value -> value/0)
        .exceptionally(throwable -> handle (throwable))
        .thenApply(value -> value+1)
        .thenAccept(result -> System.out.println(result));
    }
    public static int handle(Throwable throwable){
        System.out.println("ERROR  :"+ throwable);
        //throw  new RuntimeException();
         return 1;
    }
}
