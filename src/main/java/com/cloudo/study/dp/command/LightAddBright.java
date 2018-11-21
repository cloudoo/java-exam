package com.cloudo.study.dp.command;

public class LightAddBright implements Command{


    private Light light;
    public LightAddBright(Light light){
        this.light = light;
    }
    @Override
    public void execute() {

        light.addBright();

    }

    @Override
    public void undo() {
        light.dimBright();
    }
}
