package com.company;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;
import java.util.logging.Level;
import java.util.logging.Logger;

//class with private field and constructor

class PhaserCBTask implements Runnable{
    private final String name;
    Phaser phaser;
    PhaserCBTask(Phaser phaser,String name){
        this.phaser = phaser;
        this.name = name;
    }
//override run()
    @Override
    public void run() {
        Logger logger = Logger.getLogger(CyclicBarrier.class.getName());
        logger.log(Level.INFO,() -> "Performing "+name);
        while(true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            phaser.arriveAndAwaitAdvance();
            logger.log(Level.INFO,() -> "Resuming "+name);

        }


    }
}

//class with main() performing execute()

public class PhaserMain {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(4);
        Phaser phaser = new Phaser(3);
        service.execute(new PhaserCBTask(phaser,"Task 1"));
        service.execute(new PhaserCBTask(phaser,"Task 2"));
        service.execute(new PhaserCBTask(phaser,"Task 3"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ;

        System.out.println("End");
    }


}
