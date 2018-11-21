package com.cloudo.study.dp.command;

public class Light {

    private boolean status = false;
    private int bright = 4000;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getBright() {
        return bright;
    }

    public void setBright(int bright) {
        this.bright = bright;
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
