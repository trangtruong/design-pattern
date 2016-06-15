package com.selfie.demo.pattern.adapter;

/**
 * Created by sgtt003 on 6/1/2016.
 */
public class AdapterPatternDemo {
    public static void main(String[] arg0) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
