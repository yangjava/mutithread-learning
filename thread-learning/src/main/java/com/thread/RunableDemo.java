package com.thread;

public class RunableDemo implements Runnable{

    public void run() {
        System.out.println("这是实现Runnable接口的类");
    }
    public static void main(String[] args) throws Exception {
    	 new Thread(new RunableDemo()).start();
         Thread.sleep(1000);
	}
    
    
}

