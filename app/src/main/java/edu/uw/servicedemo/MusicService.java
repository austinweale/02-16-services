package edu.uw.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import edu.uw.servicedemo.R;

/**
 * Created by iguest on 2/16/16.
 */
public class MusicService extends Service {

    private static final String TAG = "MUSIC";
    private MediaPlayer mediaPlayer;

    @Override
    public void onCreate(){
        super.onCreate();
        Log.v(TAG, "Service created");
    }

    public int onStartCommand(Intent intent, int flags, int startId){

        mediaPlayer = MediaPlayer.create(this, R.raw.verdi_la_traviata_brindisi_mit);
        mediaPlayer.start();
        super.onStartCommand(intent, flags, startId);
        return Service.START_NOT_STICKY;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        if(mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
