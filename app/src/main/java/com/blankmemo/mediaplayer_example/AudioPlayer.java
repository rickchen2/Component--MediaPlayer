package com.blankmemo.mediaplayer_example;

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

    public void pause(Context context){
        if (mPlayer.isPlaying()) {
            mPlayer.pause();
        }
    }

    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }
}

