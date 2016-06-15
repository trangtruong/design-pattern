package com.selfie.demo.pattern.adapter;

/**
 * Created by sgtt003 on 6/1/2016.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        throw new UnsupportedOperationException("do nothing");
    }
}
