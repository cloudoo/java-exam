package com.cloudo.study.dp.command;

public class Light {

    private boolean status = false;
    private int bright = 4000;

    public void on(){
        status = true;
    }
    public void off(){
        status = false;
    }

    public void addBright(){

        this.bright += 500;
        if(this.bright>=7000){
            this.bright = 7000;
            System.out.println("已达最大亮度");
        }
        System.out.println("目前亮度："+this.bright);

    }
    public void dimBright(){

        bright -= 500;
        if(bright <=500){
            bright = 500;
            System.out.println("已达最小亮度");
        }
        System.out.println("目前亮度："+bright);

    }
}
