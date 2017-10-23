package com.thread;

public class SleepThread extends Thread{

    @Override
    public void run() {
        try{
            super.run();
            System.out.println("run threadName=" + currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName=" + currentThread().getName() +  " end");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
