package com.blankmemo.component_mediaplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private AudioPlayer mPlayer;
    private Button mPlayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create a new Audio Player Object
        mPlayer = new AudioPlayer(this, R.raw.sample);


        mPlayButton = (Button)findViewById(R.id.play_button);
        mPlayButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "play", Toast.LENGTH_SHORT).show();
                mPlayer.play();
            }
        });

        mPlayButton = (Button)findViewById(R.id.pause_button);
        mPlayButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "pause", Toast.LENGTH_SHORT).show();
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
