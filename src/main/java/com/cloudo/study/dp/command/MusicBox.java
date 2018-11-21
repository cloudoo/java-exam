package com.cloudo.study.dp.command;

import java.util.ArrayList;
import java.util.List;

public class MusicBox {
    private List<String> musicStore = new ArrayList<>();
    private int musicIndex=0;
    private int tone;//音量
    private boolean status;




    public String getMusicName() {


        if(musicStore.size()>0){

            if(musicIndex<0||musicIndex>=musicStore.size()){
                musicIndex = 0;
            }

            return musicStore.get(musicIndex);
        }

        return "没有插入音乐碟";
    }

    public void setMusicStore(List<String> musicStore ) {
        this.musicStore.addAll(musicStore);
    }

    public int getTone() {
        return tone;
    }

    public void setTone(int tone) {
        this.tone = tone;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<String> getMusicStore() {
        return musicStore;
    }

    public int getMusicIndex() {
        return musicIndex;
    }

    public void setMusicIndex(int musicIndex) {
        this.musicIndex = musicIndex;
    }
}
