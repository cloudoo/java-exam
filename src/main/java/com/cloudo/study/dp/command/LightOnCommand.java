package com.cloudo.study.dp.command;

public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
          light.on();
          System.out.println("开灯");
    }

    @Override
    public void undo() {
       light.off();
        System.out.println("关灯");
    }
}
