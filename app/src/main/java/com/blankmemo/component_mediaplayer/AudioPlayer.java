package com.blankmemo.component_mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by hongyuchen on 2018-02-18.
 */

public class AudioPlayer {
    private MediaPlayer mPlayer;
    private final static int MAX_VOLUME = 100;

    //constructor for Audio Player
    public AudioPlayer(Context context, int audioResourceID) {
        mPlayer = MediaPlayer.create(context, audioResourceID);
    }

    public void play(){
            mPlayer.start();
    }

    public void pause(){
        if (mPlayer.isPlaying()) {
            mPlayer.pause();
        }
    }

    public void volumnUp(){
        mPlayer.setVolume(1, 1);
    }

    public void volumnDown(){
        mPlayer.setVolume(0.1f, 0.1f);
    }

    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }
}

