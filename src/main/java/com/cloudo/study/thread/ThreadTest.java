package com.cloudo.study.thread;

public class ThreadTest {

    public static void main(String[] args) {

        Thread a = new Thread(new ThreadOne());
        Thread b = new Thread(new ThreadTwo(a));

        a.start();
        b.start();

    }
}
