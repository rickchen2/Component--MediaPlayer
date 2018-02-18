package com.blankmemo.component_mediaplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private AudioPlayer mPlayer = new AudioPlayer();
    private Button mPlayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayButton = (Button)findViewById(R.id.play_button);
        mPlayButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mPlayer.play(MainActivity.this);
            }
        });

        mPlayButton = (Button)findViewById(R.id.pause_button);
        mPlayButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mPlayer.pause();
            }
        });

        mPlayButton = (Button)findViewById(R.id.volumn_up_button);
        mPlayButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mPlayer.volumnUp();
            }
        });

        mPlayButton = (Button)findViewById(R.id.volumn_down_button);
        mPlayButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mPlayer.volumnDown();
            }
        });
    }

}
