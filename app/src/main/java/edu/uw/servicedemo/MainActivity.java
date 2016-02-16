package edu.uw.servicedemo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "**MAIN**";
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //when "Start" button is pressed
    public void handleStart(View v){
        //for music service without service
//        mediaPlayer = MediaPlayer.create(this, R.raw.verdi_la_traviata_brindisi_mit);
//        mediaPlayer.start();

        //for counting service
//        Log.i(TAG, "Start pressed");
//        Intent intent = new Intent(MainActivity.this, CountingService.class);
//        startService(intent); //send intent to counting service
//        //finish();
        Intent intent = new Intent(MainActivity.this, MusicService.class);
        startService(intent); //send intent to counting service

    }

    //when "Stop" button is pressed
    public void handleStop(View v){
//        if(mediaPlayer != null) {
//            mediaPlayer.stop();
//            mediaPlayer.release();
//            mediaPlayer = null;
//        }

        Log.i(TAG, "Stop pressed");
//        Intent intent = new Intent(MainActivity.this, CountingService.class);
//        stopService(intent);
    }
}


