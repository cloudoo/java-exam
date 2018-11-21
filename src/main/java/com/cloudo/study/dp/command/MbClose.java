package com.cloudo.study.dp.command;

public class MbClose implements Command{

    private final MusicBox musicBox;

    public MbClose(MusicBox musicBox){
        this.musicBox = musicBox;
    }
    @Override
    public void execute() {

        musicBox.setStatus(false);
        System.out.println("---------------关闭音乐---------------");


    }

    @Override
    public void undo() {
        musicBox.setStatus(true);
        System.out.println("---------------music 开始---------------");
        if(musicBox.getMusicName()==null||musicBox.getMusicName().length()==0){
            System.out.println("---------------播放"+musicBox.getMusicName()+"--------");
        }

        System.out.println("------------------------------------------------");
    }
}
