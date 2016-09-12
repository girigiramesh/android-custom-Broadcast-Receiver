package com.custem_broadcast_receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Ramesh on 9/12/16.
 */
public class CustomBroadCast extends BroadcastReceiver {
    private static final String TAG = ".CustomBroadCast";

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if(extras!=null){
            if(extras.containsKey("value")){
                Log.d(TAG, "onReceive: "+extras.get("value"));
                Toast.makeText(context,"yes! Custom Broadcast Receiver",Toast.LENGTH_LONG).show();
            }
        }
    }
}
