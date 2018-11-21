package com.cloudo.study.dp.command;

import sun.jvm.hotspot.utilities.HeapGraphWriter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cloudpj on 18/11/21.
 */
public class MyHomeTheater implements HomeTheater {

    private Command command;


    public MyHomeTheater (){
        Light light = new Light();
        MusicBox musicBox = new MusicBox();

        List<Command> commands = new ArrayList<>();
        commands.add(new LightOnCommand(light));
        commands.add(new MbOpen(musicBox));
        commands.add(new MbNext(musicBox));

        command = new MacroCommand(commands);

    }
    @Override
    public void playMusic() {
        command.execute();
    }


    public static void main(String[] args) {
        HomeTheater homeTheater = new MyHomeTheater();

        homeTheater.playMusic();
    }
}
