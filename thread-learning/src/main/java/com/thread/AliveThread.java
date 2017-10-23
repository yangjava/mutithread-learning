package com.thread;

public class AliveThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("run方法中是否存活" + "   "  + Thread.currentThread().isAlive());
    }
    
    public static void main(String[] args) throws InterruptedException {
    	AliveThread aliveThread = new AliveThread();
    	 System.out.println("begin == " + aliveThread.isAlive());
    	 aliveThread.start();
         Thread.sleep(1000);
         System.out.println("end ==" + aliveThread.isAlive());
         Thread.sleep(3000);
	}
}
