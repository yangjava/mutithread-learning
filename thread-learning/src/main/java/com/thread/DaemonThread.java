package com.thread;

public class DaemonThread extends Thread{

    private int i = 0;

    @Override
    public void run() {
        super.run();
        try{
            while (true){
                i++;
                System.out.println("i=" + (i));
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
    	 DaemonThread thread = new DaemonThread();
          thread.setDaemon(true);
          thread.start();
          Thread.sleep(5000);
          System.out.println("我离开了thread对象也不在打印了，也就停止了");
	}
}