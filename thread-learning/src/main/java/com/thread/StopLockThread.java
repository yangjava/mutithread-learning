package com.thread;
public class StopLockThread extends Thread{

    private SynchronizedObject object;

    public StopLockThread(SynchronizedObject object){
        this.object = object;
    }


    @Override
    public void run() {
        super.run();
        object.printString("b","bbb");
    }
}
