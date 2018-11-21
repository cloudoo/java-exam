package com.cloudo.study.dp.command;

public class LightOffCommand implements  Command{

    private Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.setStatus(false);
        System.out.println("关灯");
    }

    @Override
    public void undo() {
        light.setStatus(true);
        System.out.println("开灯");
    }
}
