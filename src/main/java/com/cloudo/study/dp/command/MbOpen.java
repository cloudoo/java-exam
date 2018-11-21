package com.cloudo.study.dp.command;

import java.util.ArrayList;
import java.util.List;

public class MbOpen implements Command{

    private final MusicBox musicBox;

    public MbOpen(MusicBox musicBox){
        this.musicBox = musicBox;
    }
    @Override
    public void execute() {
        musicBox.setStatus(true);
        System.out.println("----------------------------------------");
        System.out.println("---------------music 开始---------------");
        if(musicBox.getMusicName()==null||musicBox.getMusicName().length()==0){
            List<String> musicStore = new ArrayList<>();
            musicStore.add("七里香");
            musicStore.add("超人");
            musicStore.add("斗牛");
            musicBox.setMusicStore(musicStore);
        }
        System.out.println("---------------播放"+musicBox.getMusicName()+"---------------");

        System.out.println("------------------------------------------------");
    }

    @Override
    public void undo() {
        musicBox.setStatus(false);
        System.out.println("---------------关闭音乐---------------");
    }
}
