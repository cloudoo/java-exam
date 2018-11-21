package com.cloudo.study.dp.command;

public class LightDimLight implements Command{
    private Light light;
    public LightDimLight(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
         light.dimBright();
    }

    @Override
    public void undo() {
         light.addBright();
    }
}
