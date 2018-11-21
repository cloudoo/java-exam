package com.cloudo.study.dp.command;

public class MbNext implements Command{

    private final MusicBox musicBox;

    public MbNext(MusicBox musicBox){
        this.musicBox = musicBox;
    }
    @Override
    public void execute() {
       if(musicBox.isStatus()){

           musicBox.setTone(musicBox.getMusicIndex()+1);
           System.out.println("播放:"+musicBox.getMusicName());
       }
    }

    @Override
    public void undo() {
        if(musicBox.isStatus()){
            musicBox.setTone(musicBox.getMusicIndex()-1);
            System.out.println("播放:"+musicBox.getMusicName());
        }
    }
}
