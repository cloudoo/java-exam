package com.cloudo.study.thread;

public class ThreadOne implements Runnable{


    @Override
    public void run(){
            for(int i=0;i<100;i++){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("a:"+i);
        }
    }


}


