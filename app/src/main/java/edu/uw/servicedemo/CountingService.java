package edu.uw.servicedemo;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by iguest on 2/16/16.
 */
public class CountingService extends IntentService {
    private static final String TAG = "*IS**";

    public CountingService() {
        super("CountingService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.v(TAG, "Handline Event");

        for(int i = 0; i < 10; i++){
            Log.v(TAG, "" + i);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
