package com.company;

import java.util.ArrayList;
import java.util.Date;

//Main class with init()

public class Main {


        private static void init(){
        GCTestAgent agent = new GCTestAgent();
        }
        public static void main(String[] args) throws Exception {
            init();
            for (; ; ) {
                Thread.sleep(1000);
            }
        }

}

//class having impl of GCTestAgentMBean 

class GCTestAgent implements GCTestAgentMBean, Runnable {
    ArrayList<Object> leakingMap = new ArrayList<Object>();
    volatile double val = 10;

    @Override
    public void newThread(String threadName) {
        Thread newThread = new Thread(this);
        newThread.setName(threadName);
        newThread.start();
    }

    @Override
    public void newCollectableObject(int size) {
        createObject(size);
    }

    private Object createObject(int size) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            list.add( (new Date()).toString() + " " +  i);
        }
        return list;
    }

    @Override
    public void newLeakedObject(int size) {
        leakingMap.add(createObject(size));
    }

    @Override
    public void run() {
        for (;;) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void clearLeaked() {
        leakingMap.clear();
    }

    @Override
    public void cpuIntensiveOperation(int iterations) {
        int[] myArrayToBeSorted = new int[] {4,2,6,7,2,1,6};
        for (int i = 0; i < iterations; i++) {
            for (int j = 0; j < myArrayToBeSorted.length - 1; j++) {
                myArrayToBeSorted[j] = myArrayToBeSorted[j] + myArrayToBeSorted[j + 1];
            }
        }
    }

}
interface GCTestAgentMBean {
    void newThread(String threadName);
    void newCollectableObject(int size);
    void newLeakedObject(int size);
    void clearLeaked();
    void cpuIntensiveOperation(int iterations);
}
