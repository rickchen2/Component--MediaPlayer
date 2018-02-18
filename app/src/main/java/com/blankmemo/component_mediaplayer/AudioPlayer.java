package com.blankmemo.component_mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by hongyuchen on 2018-02-18.
 */

public class AudioPlayer {
    private MediaPlayer mPlayer;

    public void play(Context context){
            mPlayer = MediaPlayer.create(context, R.raw.sample);
            mPlayer.start();
    }

    public void pause(){
        if (mPlayer.isPlaying()) {
            mPlayer.pause();
        }
    }

    public void volumnUp(){
        mPlayer.setVolume(0.8f, 0.8f);
    }

    public void volumnDown(){
        mPlayer.setVolume(0.2f, 0.2f);
    }

    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }
}

