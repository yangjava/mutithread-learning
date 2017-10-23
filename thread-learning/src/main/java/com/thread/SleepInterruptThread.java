package com.thread;

public class SleepInterruptThread extends Thread{

    @Override
    public void run() {
        super.run();
        try{
            System.out.println("run begin");
            Thread.sleep(20000000);
            System.out.println("run end");
        }catch (Exception e){
            System.out.println("在沉睡中被停止!进入catch!" + this.isInterrupted());

        }
    }
}
