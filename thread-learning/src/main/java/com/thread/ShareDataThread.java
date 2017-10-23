package com.thread;

public class ShareDataThread extends Thread{

    private int count = 5;

    @Override
     public void run() {
        super.run();
        count--;
        System.out.println(currentThread().getName() + "count=" + count);
    }
}
