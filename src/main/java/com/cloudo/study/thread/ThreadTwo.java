package com.cloudo.study.thread;

public class ThreadTwo implements Runnable{

    Thread thread;
    public ThreadTwo(Thread thread){
            this.thread = thread;
    }
    @Override
    public void run(){
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("b:"+i);
        }
    }
}
