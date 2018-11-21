package com.cloudo.study.dp.singleton;

/**
 *
 * 饿汉模式
 *
 */
public class Singleton {

    private Singleton(){

    }
    private final static Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
}
