package com.thread;

public class NotShareDataThread extends Thread{

    private int count = 5;


    public NotShareDataThread(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("++++++++++++++++++");
        while (count > 0){
            count--;
            System.out.println(currentThread().getName() + "计算，count=" +count);
        }
    }
    
    
    
    public static void main(String[] args) throws InterruptedException {
    	  NotShareDataThread a = new NotShareDataThread("A");
          NotShareDataThread b = new NotShareDataThread("B");
          NotShareDataThread c = new NotShareDataThread("C");

          a.start();
          b.start();
          c.start();

          Thread.sleep(1000);
	}
    
    
    
    
}
