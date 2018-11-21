package com.cloudo.study.dp.command;

public class LightDimLight implements Command{
    private Light light;
    public LightDimLight(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.setBright(light.getBright()-500);
        if(light.getBright()<=500){
            light.setBright(500);
            System.out.println("已达最小亮度");
        }
        System.out.println("目前亮度："+light.getBright());
    }

    @Override
    public void undo() {
        if(!light.isStatus()){
            light.setStatus(true);

        }
        light.setBright(light.getBright()+500);
        if(light.getBright()>=7000){
            light.setBright(7000);
            System.out.println("已达最大亮度");
        }
        System.out.println("目前亮度："+light.getBright());
    }
}
