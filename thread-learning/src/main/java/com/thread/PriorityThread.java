package com.thread;

public class PriorityThread extends Thread{

    private int count = 0;
    @Override
    public void run() {
        super.run();
        while (true){
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public static void main(String[] args) throws InterruptedException {
    	PriorityThread threadA = new PriorityThread();
         threadA.setPriority(Thread.NORM_PRIORITY - 3 );
         threadA.start();
         PriorityThread threadB = new PriorityThread();
         threadB.setPriority(Thread.NORM_PRIORITY + 3);
         threadB.start();
         Thread.sleep(20000);
         threadA.stop();
         threadB.stop();

         System.out.println("a=" + threadA.getCount());
         System.out.println("b=" + threadB.getCount());
	}
    
}