package com.thread;

public class  IdThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println(currentThread().getName() + " +++" + currentThread().getId());
    }
    
    public static void main(String[] args) throws Exception {
    	IdThread thread = new IdThread();
         thread.start();
         Thread.sleep(1000);
	}
}