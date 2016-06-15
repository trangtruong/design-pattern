package com.selfie.demo.pattern.adapter;

/**
 * Created by sgtt003 on 6/1/2016.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        throw new UnsupportedOperationException("Do nothing");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file name: " + fileName);
    }
}
