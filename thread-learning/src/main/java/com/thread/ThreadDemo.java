package com.thread;

public class ThreadDemo extends Thread{
	
    @Override
    public void run() {
        super.run();
        System.out.println("这是一个继承自Thread的ThreadDemo");
    }
    
    
    public static void main(String[] args) throws Exception {
    	ThreadDemo exampleThread = new ThreadDemo();
         exampleThread.start();
         Thread.sleep(1000);
	}
    
}
